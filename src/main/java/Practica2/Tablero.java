package Practica2;

public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual;

    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    public void leerEstadoActual() {
        int contador =0;
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = contador;
                contador++;
                System.out.println(estadoActual[i][j]);
            }
        }



    }

    public void generarEstadoActualPorMontecarlo(){

    }

    public void transitarAlEstadoSiguiente(){

    }

    public String toString(){
        return "El estado actual es: " + estadoActual;
    }
}


