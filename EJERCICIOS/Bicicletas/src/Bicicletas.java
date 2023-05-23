public class Bicicletas {
    String tipo=null;
    int marchas=0;
    // objetos

    //Establecer o setter
   public void establerTipo(String Mitipo){
       tipo = Mitipo;
   }
    public void establecerMarchas(int Mimarchas){
         marchas = Mimarchas;
    }
    public void obtenerMarchas(){
        System.out.println("Numero de marchas: "+marchas);
    }
    // obtener getters
    public String mostrarTipo(){
        return tipo;
    }
    public int mostrarMarchas(){
        return marchas;
    }
    public void mostrarTipo(String Tipo) {
        System.out.println("Tipo"+Tipo);
    }
    public void numeroMarchas(int marchas) {
        System.out.println("Numero de marchas: "+marchas);
    }




}
