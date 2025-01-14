package Act6;

public class Fraccion {
    //Atributos de objeto
    public int numerador;
    public int denominador;
    //int[] fraccion;  <--otra forma de hacerlo es con un arraid, pero es más complicado

    //Métodos de objeto    simplifica, multiplica, divide
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

    Fraccion multiplica(Fraccion fraccion1, Fraccion fraccion2){
        Fraccion fraccion3 = new Fraccion();
        //tenemos que tener en cuenta que en el futuro pueden ser los atributos privados

        fraccion1.numerador = fraccion1.getNumerador();
        fraccion1.denominador = fraccion1.getDenominador();
        fraccion2.numerador = fraccion2.getNumerador();
        fraccion2.denominador = fraccion2.getDenominador();

        fraccion3.numerador = fraccion1.numerador * fraccion2.numerador;
        fraccion3.denominador = fraccion1.denominador * fraccion2.denominador;

        return fraccion3;
    }

    Fraccion divide(Fraccion fraccion1, Fraccion fraccion2){
        Fraccion fraccion3 = new Fraccion();

        fraccion1.numerador = fraccion1.getNumerador();
        fraccion1.denominador = fraccion1.getDenominador();
        fraccion2.numerador = fraccion2.getNumerador();
        fraccion2.denominador = fraccion2.getDenominador();

        fraccion3.numerador = fraccion1.numerador * fraccion2.denominador;
        fraccion3.denominador = fraccion1.denominador * fraccion2.numerador;

        return fraccion3;
    }


}
