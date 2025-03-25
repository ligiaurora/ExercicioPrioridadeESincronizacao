package Exercicio5;

import java.util.Random;
public class MonitorarTemperatura implements Runnable {
    @Override
    public void run() {
        Random random = new Random();

        while (CaldeiraEstado.ligada && !CaldeiraEstado.desligar) {
            int temperatura = 1400 + random.nextInt(300);
            System.out.println("Temperatura atual: " + temperatura + "°C");

            if (temperatura > 1600) {
                System.out.println("Temperatura acima do esperado! A Caldeira vai ser desligada");
                CaldeiraEstado.desligar = true;
                break;
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Monitoramento de temperatura interrompido.");
            }
        }

        System.out.println("Monitoramento de temperatura encerrado.");
    }
}
