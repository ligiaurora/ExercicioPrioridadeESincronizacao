package Exercicio5;

public class DesligarCaldeira implements Runnable {
    @Override
    public void run() {
        while (!CaldeiraEstado.desligar) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Caldeira de Desligamento Interrompido");
            }
        }
        System.out.println("Desligando a Caldeira...");
        CaldeiraEstado.ligada = false;
        System.out.println("A Caldeira está Desligada.");
    }
}
