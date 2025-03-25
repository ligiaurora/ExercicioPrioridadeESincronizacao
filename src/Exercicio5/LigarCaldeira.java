package Exercicio5;

public  class LigarCaldeira implements Runnable {
    @Override
    public void run() {
        System.out.println("Ligando a caldeira...");
        CaldeiraEstado.ligada = true;
        System.out.println("A Caldeira está ligada.");
    }
}
