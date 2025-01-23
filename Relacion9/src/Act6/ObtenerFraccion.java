package Act6;
import java.util.Scanner;

//Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los métodos
//pueden ser invierte, simplifica, multiplica, divide. Crea un programa para probar los distintos
//métodos.

public class ObtenerFraccion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion();
        Fraccion fraccion3 = new Fraccion();

        int num, den;
        System.out.println("Introduce el valor del numerador de la primera fraccion: ");
        num = entrada.nextInt();
        System.out.println("Introduce el valor del denominador de la primera fraccion: ");
        den = entrada.nextInt();

        fraccion1.setFraccion(num, den);
        System.out.printf("La fraccion 1 es %d/%d", fraccion1.getNumerador(), fraccion1.getDenominador());
        System.out.println();

        System.out.println("Introduce el valor del numerador de la segunda fraccion: ");
        num = entrada.nextInt();
        System.out.println("Introduce el valor del denominador de la segunda fraccion: ");
        den = entrada.nextInt();

        fraccion2.setFraccion(num, den);
        System.out.printf("La fraccion 2 es %d/%d\n", fraccion2.getNumerador(), fraccion2.getDenominador());
        System.out.println();


        fraccion3 = Fraccion.multiplica(fraccion1, fraccion2); //pongo directamente el nombre de la clase en vez de un objeto

        System.out.println("La multiplicacion de ambas fracciones es: " + fraccion3.getNumerador() + "/" + fraccion3.getDenominador());

    }
}
