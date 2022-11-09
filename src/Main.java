import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
/*
Crear un programa que dado un array de nombres de colores, cuente mediante hilos y
gestionado por semáforos la cantidad de colores que hay. Cada hilo deberá contar el
número de apariciones de un determinado color y guardarlo en una variable global para
todos los hilos. De esta forma tendremos:
- El hilo “rojo” que contará las veces que aparece el color rojo.
- El hilo “verde” que contará las veces que aparece el color verde.
- El hilo “azul” que contará las veces que aparece el color azul.

Cada hilo deberá decir antes de terminar: su nombre y cuantos colores ha contado. Por
último el hilo principal esperará a que todos los hilos hayan terminado para entonces
decir cuántos colores hay en total en la lista.
 */
        Semaphore semaphore=new Semaphore(3);

       Colores azul,rojo,verde;
        azul =new Colores("AZUL",semaphore);
        rojo= new Colores("ROJO",semaphore);
        verde=new Colores("VERDE",semaphore);

        azul.start();
        rojo.start();
        verde.start();

        azul.join();
        rojo.join();
        verde.join();

        System.out.println("Fin del proceso");
    }
}