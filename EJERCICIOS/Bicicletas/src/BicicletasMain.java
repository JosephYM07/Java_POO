import java.util.Scanner;

public class BicicletasMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Bicicletas bici = new Bicicletas();
        Bicicletas bici2 = new Bicicletas();
        Bicicletas bici3 = new Bicicletas();
        System.out.print("Ingrese el tipo de bicileta: ");
        String tipo = entrada.nextLine();
        System.out.print("Ingrese el numero de marchas: ");
        int marchas = entrada.nextInt();
        bici.establecerMarchas(marchas);
        bici.establerTipo(tipo);
        bici2.establecerMarchas(10);
        bici2.establerTipo("Urbana");
        bici3.establecerMarchas(15);
        bici3.establerTipo("Carrera");
        System.out.println("Tipo de bicicleta: " + bici.mostrarTipo());
        System.out.println("Numero de marchas: " + bici.mostrarMarchas());
        System.out.println("Tipo de bicicleta: " + bici2.mostrarTipo());
        System.out.println("Numero de marchas: " + bici2.mostrarMarchas());
        System.out.println("Tipo de bicicleta: " + bici3.mostrarTipo());
        System.out.println("Numero de marchas: " + bici3.mostrarMarchas());
    }
}
