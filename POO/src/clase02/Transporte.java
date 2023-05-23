package clase02;

public class Transporte {
    // Atributos
    String Tipo;
    String Fabricante = "ChinaCorp";
    String Modelo;
    Integer Velocidad = 200;
    Integer Peso = 0;

    //Métodos
    public void Motor() {
        System.out.println("Metodo Motor");
    }
    public void Distancia() {
        System.out.println("Método Distancia ");
    }

    public void Aceleracion() {
        System.out.println("Método Aceleracion");
    }

    public void Diseño() {
        System.out.println("Méotodo Diseño");
    }

    public void franar() {
        System.out.println("Metodo frenar");
    }
}
