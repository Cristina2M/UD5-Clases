package Act7;

public class PedidosPiza {
            public static void main(String[] args) {
             Pizza p1 = new Pizza("Margarita", "Mediana");
             Pizza p2 = new Pizza("Funghi", "Familiar");
             p2.sirve();
             Pizza p3 = new Pizza("Cuatro quesos", "Mediana");
             System.out.println(p1);
             System.out.println(p2);
             System.out.println(p3);
             p2.sirve();
             System.out.println("Pedidas" + Pizza.getToltalPedidas());
             System.err.println("Servidas" + Pizza.getTotalServidas());
         }
         }

