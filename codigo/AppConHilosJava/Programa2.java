public class Programa2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "subproceso corriendo...");
    }

    public static void main(String[] args){
        Programa2 hilo = new Programa2();
        hilo.start();
        System.out.println("Este código esta fuera del hilo.");
    } 
}