package Act3;

public class Perro {
    //Atributos
    private String razaPerro;
    private String orejas;

       //Métodos
       String obtenerRazaPerro(){
        return razaPerro;
    }

    String obtenerOrejas(){
        return orejas;
    }

    void establecerRazaPerro(String razaPerro){
        this.razaPerro = razaPerro;
    }

    void establecerOrejas(String orejas){
        this.orejas = orejas;
    }
}
