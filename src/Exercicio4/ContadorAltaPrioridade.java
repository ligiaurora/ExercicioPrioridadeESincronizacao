package Exercicio4;

public class ContadorUm implements Runnable{
   String nome;

   public ContadorUm(String nome){
       this.nome= nome;
   }

    @Override
    public void run(){
       for (int i = 0; i < 10; i++){
           System.out.println(nome + "" +i);
       }
    }
}
