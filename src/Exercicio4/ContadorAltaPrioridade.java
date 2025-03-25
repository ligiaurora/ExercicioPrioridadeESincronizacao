package Exercicio4;

public class ContadorAltaPrioridade implements Runnable{

    @Override
    public void run(){
       for (int i = 0; i < 10; i++){
           System.out.println("Contador de Alta Prioridade" + "" + i);


           try {
               Thread.sleep(200);
           } catch (InterruptedException e) {
               System.out.println("Contador de Alta Prioridade Interrompido");
           }
       }
       System.out.println("Contador de Alta Prioridade Finalizado");
    }
}
