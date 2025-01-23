package Act7;

public class Pizza {
    //atributos clase
    String tamaño;
    String tipo;
    String estado; //estado puede ser "pedida" o "servida"
    static int numPedidas=0;
    static int numServidas=0;

    //metodo constructor
    Pizza(String tamaño, String tipo){
        this.tamaño = tamaño;
        this.tipo=tipo;
        this.estado="pedida";
        this.numPedidas++;
    }

    //metodos del objeto
    void sirve(){
        if (this.estado.equals("servida")) {
            System.out.println("Esta pizza ya está servida");
        } else{
            this.estado = "servida";
        }
        this.numServidas++;
    }

    static int getToltalPedidas(){
        return numPedidas;
    }

    static int getTotalServidas(){
        return numServidas;
    }



}
