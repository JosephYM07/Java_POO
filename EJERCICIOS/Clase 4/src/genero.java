public class genero {

    // atributos de la clase
    String tipo;
    String ritmo;
    int anio;
    String Pais;
    String artista;
    String festival;


    //getter y setter
    public String getTipo(String genero) {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRitmo(String bpm) {
        return ritmo;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }

    public int getAnio(int anio2) {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPais(String pais) {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getArtista(String artista) {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFestival(String festival) {
        return this.festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }
    //constructores nos ayuda a inicializar los atributos de la clase para que no esten vacios

    public genero(String tipo, String ritmo, int anio, String pais, String artista, String festival) { //Todo lo que se utilice en el constructor debe de estar en los atributos de la clase
        this.tipo = tipo;
        this.ritmo = ritmo;
        this.anio = anio;
        this.Pais = pais;
        this.artista = artista;
        this.festival = festival;
    }

    public void mostrarDatos() {
        System.out.println(this.tipo);
        System.out.println(this.ritmo);
        System.out.println(this.anio);
        System.out.println(this.Pais);
        System.out.println(this.artista);
        System.out.println(this.festival);
    }
}
