package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Thread ligar = new Thread(new LigarCaldeira());

        Thread monitorTemperatura = new Thread(new MonitorarTemperatura());
        Thread desligar = new Thread(new DesligarCaldeira());

        ligar.setPriority(Thread.MIN_PRIORITY);
        desligar.setPriority(Thread.MAX_PRIORITY);
        monitorTemperatura.setPriority(Thread.NORM_PRIORITY);

        ligar.start();

        try {
            ligar.join();
        } catch (InterruptedException e) {
            System.out.println("Caldeira sendo interrompida");
        }

        monitorTemperatura.start();
        desligar.start();
    }
}

