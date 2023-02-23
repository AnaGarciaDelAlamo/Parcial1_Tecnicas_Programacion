package Practica2;

public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual;

    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    public void leerEstadoActual() {


    }

    public void generarEstadoActualPorMontecarlo(){

    }

    public void transitarAlEstadoSiguiente(){

    }

    public String toString(){
        return "El estado actual es: " + estadoActual;
    }
}


