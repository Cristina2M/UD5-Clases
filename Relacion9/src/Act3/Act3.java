package Act3;
//3. Crea las clases Animal, Mamifero, Ave, Gato, Perro. Crea, al menos, tres métodos específicos de cada
//clase. Prueba las clases creadas en un programa en el que se instancien objetos y se les apliquen
//métodos.

public class Act3 {
    public static void main(String[] args) {
//Animal
Animal animal1 = new Animal();

animal1.establecerNombre("León");
animal1.establecerEdad(15);

System.err.println("El nombre y la edad del animal son " + animal1.obtenerNombre() + " y " + animal1.obtenerEdad() + " años");
System.out.println();

//Mamifero
Mamifero mamifero1 = new Mamifero();

mamifero1.establecerTipoPelaje("Suave");
mamifero1.establecerFamilia("Felino");

System.out.println("El mamífero tiene un tipo de pelaje " + mamifero1.obtenerTipoPelaje() + " y pertenece a la familia de los " + mamifero1.obtenerFamilia());
System.out.println();

//Ave
Ave ave1 = new Ave();
ave1.establecerTipoPlumas("Sedosa");
ave1.establecerRazaAve("Carroñera");

System.out.println("La raza del ave es " + ave1.obtenerRazaAve() +" y el tipo de plumas es " + ave1.obtenerTipoPlumas());
System.out.println();

//Gato
Gato gato1 = new Gato();
gato1.establecerRazaGato("Siamés");
gato1.establecerOjos("Rasgados");

System.out.println("La raza del gato es " + gato1.obtenerRazaGato() + " y sus ojos son " + gato1.obtenerOjos());
System.out.println();

//Perro
Perro perro1 = new Perro();
perro1.establecerOrejas("Caídas");
perro1.establecerRazaPerro("Basset Hound");

System.out.println("La raza del perro es " + perro1.obtenerRazaPerro() + " y sus orejas son " + perro1.obtenerOrejas());
System.out.println();

    }
}
