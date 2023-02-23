package Practica1.mates;
import java.util.Scanner;
public class Matematicas {
    Scanner sc = new Scanner(System.in);
    public void MetodoMontecarlo(){
        System.out.println("Ingrese la cantidad de puntos que quiere generar: ");
        int puntosTotales = sc.nextInt();
        int aciertos = 0;
        double areaCuadrado = 4;
        for (int i = 0; i < puntosTotales; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
                aciertos++;
            }
        }
        double pi = (aciertos * areaCuadrado) / puntosTotales;
        System.out.println("El valor de pi es: " + pi);

    }
}
