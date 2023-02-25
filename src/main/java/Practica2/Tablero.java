package Practica2;

public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual = new int[DIMENSION][DIMENSION];

    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    public void leerEstadoActual() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.print(estadoActual[i][j]);
            }
            System.out.println();
        }


    }

    public void generarEstadoActualPorMontecarlo() {
        int[][] estadoActual = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = (Math.random() < 0.5) ? 1 : 0;
            }
        }
    }

    public void transitarAlEstadoSiguiente() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                int vecinosVivos = contarVecinosVivos(i, j);
                if (vecinosVivos == 3) {
                    estadoSiguiente[i][j] = 1;
                } else if (vecinosVivos == 2) {
                    estadoSiguiente[i][j] = estadoActual[i][j];
                } else {
                    estadoSiguiente[i][j] = 0;
                }
            }
        }
        estadoActual = estadoSiguiente;
    }

    private int contarVecinosVivos(int i, int j) {
        int vecinosVivos = 0;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k >= 0 && k < DIMENSION && l >= 0 && l < DIMENSION && estadoActual[k][l] == 1) {
                    vecinosVivos++;
                }
            }
        }
        if (estadoActual[i][j] == 1) {
            vecinosVivos--;
        }
        return vecinosVivos;
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


