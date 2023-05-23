public class LibroCalificacion {

    private String nombreDelCurso="JAVA"; // Se utiliza private para que no se pueda acceder a la variable desde fuera de la clase

    // muestra un mensaje de bienvenida al usuario de LibroCalificacion
    public void mostrarMensaje() {
        System.out.println("Bienvenido al libro de calificaciones para " + obtenerNombreDelCurso());
    }
    public void establecerNombreDelCurso(String nombre) {
        nombreDelCurso = nombre; //Se guarda en memoria el valor de la variable nombre en la variable nombreDelCurso
    }
    public String obtenerNombreDelCurso() {
        return nombreDelCurso; //se retorna el valor de la variable nombreDelCurso para que pueda ser utilizado en otra clase
    }
}
