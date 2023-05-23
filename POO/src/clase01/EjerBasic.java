package clase01;

import java.util.Scanner;

public class EjerBasic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
        }
        /*
        System.out.print("Ingrese un numero: ");
        int number = input.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int number2 = input.nextInt();
        System.out.println("La suma de los numeros es: " + (number + number2));
        System.out.println("La resta de los numeros es: " + (number - number2));
        System.out.println("La multiplicacion de los numeros es: " + (number * number2));
        * */


    }
}
