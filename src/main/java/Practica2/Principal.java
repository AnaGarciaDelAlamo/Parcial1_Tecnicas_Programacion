package Practica2;

public class Principal {
    public static void main(String[] args) {
        try{
            Tablero tablero = new Tablero();
            System.out.println("SIMULACIÓN CON TABLERO LEÍDO");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
