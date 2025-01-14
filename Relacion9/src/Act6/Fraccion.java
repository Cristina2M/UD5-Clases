package Act6;

public class Fraccion {
    //Atributos de objeto
    int numerador;
    int denominador;
    //int[] fraccion;  <--otra forma de hacerlo es con un arraid, pero es más complicado

    //Métodos de objeto
    void setFraccion(int num, int den){
        numerador = num;
        denominador = den;
    }

    void invierte(){
        int cambiar;

        cambiar = numerador;
        numerador = denominador;
        denominador = cambiar;
    }

    int getNumerador(){
        return numerador;
    }

    int getDenominador(){
        return denominador;
    }

    static Fraccion multiplica(Fraccion fraccion1, Fraccion fraccion2){ //al poner static se convierte en un metodo de clase, no de objeto
        Fraccion fraccion3 = new Fraccion();
        //tenemos que tener en cuenta que en el futuro pueden ser los atributos privados


        fraccion3.setFraccion(fraccion1.getNumerador()*fraccion2.getNumerador(), fraccion1.getDenominador()*fraccion2.getDenominador());


        return fraccion3;
    }

    static Fraccion divide(Fraccion fraccion1, Fraccion fraccion2){ //al poner static se convierte en un metodo de clase, no de objeto
        Fraccion fraccion3 = new Fraccion();

        fraccion3.setFraccion(fraccion1.getNumerador()*fraccion2.getDenominador(), fraccion1.getDenominador()*fraccion2.getNumerador());

        return fraccion3;
    }


}
