package Figuras2D;

public class Figuras2D {
    int nLados;
    //constructor
    public Figuras2D(int nLados) {
        this.nLados = nLados;
    }
    //getters y setters
    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    //Cuadrado
    areaCuadrado(float lado) {
        return lado * lado;
    }
}
