import java.util.concurrent.Semaphore;

public class Colores  extends Thread{
    private Semaphore semaphore;

    public static int contadorRojo=0;
    public static int contadorAzul=0;
    public static int contadorVerde=0;

    public Colores(String name ,Semaphore semaphore ) {
        super( name);
        this.semaphore=semaphore;
    }

    @Override
    public void run() {
        super.run();

        if(this.getName().equalsIgnoreCase("Rojo")){
            System.out.println("Soy el color Rojo");

            try {
                semaphore.acquire();
                for (int i = 0; i < 50; i++) {
                    contadorRojo++;
                    System.out.println("ROJO: "+contadorRojo);
                    sleep(100);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                semaphore.release();
            }
        }
        if(this.getName().equalsIgnoreCase("Azul")){
            System.out.println("Soy el color Azul");

            try {
                semaphore.acquire();
                for (int i = 0; i < 50; i++) {
                    contadorAzul++;
                    System.out.println("AZUL: "+contadorAzul);
                    sleep(100);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                semaphore.release();
            }
        } if(this.getName().equalsIgnoreCase("Verde")){
            System.out.println("Soy el color Verde");

            try {
                semaphore.acquire();
                for (int i = 0; i < 50; i++) {
                    contadorVerde++;
                    System.out.println("VERDE: "+contadorVerde);
                    sleep(100);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                semaphore.release();
            }
        }


    }
}
