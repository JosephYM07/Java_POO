import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        genero genero1 = new genero(
                "Rock",
                "120bmp",
                1957,
                "Estados Unidos",
                "Corey Taylor",
                "Knotfest");
        genero genero2 = new genero(
                "Rock Psicodélico",
                "120bmp",
                1960,
                "Reino Unido",
                "AC/DC",
                "Knotfest");
        genero genero3 = new genero(
                "Punk Rock",
                "120bmp",
                1970,
                "Estados Unidos",
                "The Ramones",
                "Knotfest");
        genero genero4 = new genero(
                "Rock Alternativo",
                "120bmp",
                1980,
                "Estados Unidos",
                "Nirvana",
                "Knotfest");
        genero genero5 = new genero(
                "Grunge",
                "129bmp",
                1990,
                "Estados Unidos",
                "Pearl Jam",
                "Knotfest");
        String genero, bpm, pais, artista, festival;
        int anio2;
        System.out.println("Ingrese el genero:");
        genero = sc.nextLine();
        System.out.print("Ingrese el bpm:");
        bpm = sc.nextLine();
        System.out.print("Ingrese el año:");
        anio2 = sc.nextInt();
        System.out.print("Ingrese el pais:");
        pais = sc.next();
        sc.nextLine();
        System.out.print("Ingrese el artista:");
        artista = sc.nextLine();
        System.out.print("Ingrese el festival:");
        festival = sc.nextLine();
        genero1.setTipo(genero);
        genero1.setRitmo(bpm);
        genero1.setAnio(anio2);
        genero1.setPais(pais);
        genero1.setArtista(artista);
        genero1.setFestival(festival);

        genero1.mostrarDatos();

    }

}
