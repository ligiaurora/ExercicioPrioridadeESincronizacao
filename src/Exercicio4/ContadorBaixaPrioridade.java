package Exercicio4;

public class ContadorBaixaPrioridade implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ContadorBaixaPrioridade: " + i);

            if (Math.random() < 0.5) {
                try{
                    int pausa = (int)(Math.random()*100);
                    System.out.println( "Contador de Baixa prioridade com pausa de:" + ""+ pausa + "ms");
                    Thread.sleep(pausa);
                }catch(InterruptedException e){
                    System.out.println("Contador de Baixa prioridade Interrompido");
                }

            }
            try{
                Thread.sleep(180);
            } catch (InterruptedException e) {
                System.out.println("Contador de Baixa prioridade Interrompido");
            }
        }
        System.out.println("Contador de Baixa prioridade Finalizado");
    }
}
