public class Programa1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "subproceso corriendo...");
    }

    public static void main(String[] args) {
        Thread hilo = new Thread(new Programa1(), "Hilo1 ");
        hilo.start();
    }

}