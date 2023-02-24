package Practica2;

public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual = new int[DIMENSION][DIMENSION];

    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];


    public void leerEstadoActual() {
        estadoActual = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.println(estadoActual[i][j] = (Math.random() < 0.5) ? 1 : 0);
            }
        }


    }

    public void generarEstadoActualPorMontecarlo() {
        estadoActual = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = (Math.random() < 0.5) ? 1 : 0;
            }
        }
    }

    public void transitarAlEstadoSiguiente() {
        estadoSiguiente = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoSiguiente[i][j] = (Math.random() < 0.5) ? 1 : 0;
            }
        }
        estadoActual = estadoSiguiente;
    }

    public String toString() {
        String tablero = "";
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                tablero += estadoActual[i][j] + " ";
            }

        }
        return tablero;
    }
}


