public class Main {
    public static void main(String[] args) {
        bicicletas bici = new bicicletas();
        bicicletas bici2 = new bicicletas();
        bicicletas bici3 = new bicicletas();

        bici.setMarchas(10);
        bici.setTipo("Urbana");
        bici2.setMarchas(15);
        bici2.setTipo("Carrera");
        bici3.setMarchas(20);
        bici3.setTipo("Montaña");

        System.out.println("Tipo de bicicleta: " + bici.getTipo()+" Numero de marchas: " + bici.getMarchas());
        System.out.println();
        System.out.println("Tipo de bicicleta: " + bici2.getTipo()+" Numero de marchas: " + bici2.getMarchas());
        System.out.println();
        System.out.println("Tipo de bicicleta: " + bici3.getTipo()+" Numero de marchas: " + bici3.getMarchas());
        System.out.println();
    }
}
