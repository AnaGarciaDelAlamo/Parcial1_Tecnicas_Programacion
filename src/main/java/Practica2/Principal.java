package Practica2;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
public class Principal {
    public static void main(String[] args) {
        try{
            Tablero tablero = new Tablero();
            System.out.println("SIMULACIÓN CON TABLERO LEÍDO");
            tablero.leerEstadoActual();

            for (int i = 0; i < 10; i++) {
                tablero.transitarAlEstadoSiguiente();

            }
            System.out.println("SIMULACIÓN CON TABLERO GENERADO POR MONTECARLO");
            tablero.generarEstadoActualPorMontecarlo();
            for (int i = 0; i < 15; i++) {
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
