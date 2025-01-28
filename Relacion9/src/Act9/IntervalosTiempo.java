package Act9;

public class IntervalosTiempo {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(10, 20, 40);
        Tiempo tiempo2 = new Tiempo(11, 60, 120);

        System.out.println(tiempo);
        System.out.println(tiempo2);

        Tiempo tiempo3 = tiempo.suma(tiempo2);
        System.out.println(tiempo3);


        Tiempo tiempo4 = tiempo.resta(tiempo2);
        System.out.println(tiempo4);
    }
}
