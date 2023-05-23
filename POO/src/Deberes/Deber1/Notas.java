package Deberes.Deber1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        float Notas[] = new float[5];
        float Suma = 0;

        System.out.println("\tIngreso de Notas");
        System.out.println("============================================");
        for (int i = 0; i < Notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " del estudiante: ");
            Notas[i] = input.nextFloat();
            float nota = Notas[i];
            if (nota < 1 || nota > 20) {
                System.out.println("La nota ingresada no es valida");
                i--;
            }
        }
        for (int i = 0; i < Notas.length; i++) {
            Suma += Notas[i];
        }
        float Promedio = Suma / Notas.length;
        System.out.println("El promedio de las notas es: " + df.format(Promedio));
        //System.out.println("El promedio de las notas es: " +  String.format("%.2f", Promedio));
    }
}
