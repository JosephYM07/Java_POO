import java.util.Scanner;

public class PruebaLibroCalificacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* Se crea un objeto LibroCalificacion y se le asigna miLibroCalificaciones */
        LibroCalificacion miLibroCalificaciones = new LibroCalificacion();
        /* muestra el valor inicial de nombreDelCurso */
        System.out.println("El nombre inicial del curso es:" + miLibroCalificaciones.obtenerNombreDelCurso()); // el %s sirve para mostrar el valor de una variable de tipo String
        /* se pide al usuario que escriba el nombre del curso */
        System.out.print("Escriba el nombre del curso: ");
        String elnombre = entrada.nextLine();
        miLibroCalificaciones.establecerNombreDelCurso(elnombre); // se llama al metodo establecerNombreDelCurso de miLibroCalificaciones
        System.out.println();
        /* se llama al metodo mostrarMensaje de miLibroCalificaciones */
        miLibroCalificaciones.mostrarMensaje();

    }
}
