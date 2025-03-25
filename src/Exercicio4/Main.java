package Exercicio4;

public class Main {
    public static void main(String[] args) {

        Thread altaPrioridade = new Thread(new ContadorAltaPrioridade());
        Thread baixaPrioridade = new Thread(new ContadorBaixaPrioridade());

        altaPrioridade.setPriority(Thread.MAX_PRIORITY);
        baixaPrioridade.setPriority(Thread.MIN_PRIORITY);

        altaPrioridade.start();
        baixaPrioridade.start();

        try{
            altaPrioridade.join();
            baixaPrioridade.join();
        } catch(InterruptedException e){
            System.out.println("Main Interrompida");
        }
        System.out.println("Main Finalizado");
    }
}