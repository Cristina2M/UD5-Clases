package Act9;

public class Tiempo {
    int horas;
    int minutos;
    int segundos;

    //Constructores
    Tiempo(int h,  int m, int s){
        this.horas = h;
        this.minutos = m;
        this.segundos = s;
    }

    Tiempo(int h){
        this.horas = h;
        this.minutos = 0;
        this.minutos = 0;
    }

    Tiempo (int h, int m){
        this.horas = h;
        this.minutos = m;
        this.segundos = 0;
    }

    //metodo ToString
    @Override
    public String toString(){
        return (this.horas + "h " + this.minutos + "m " + this.segundos + "s"); 
    }

    //metodos
    public Tiempo suma (Tiempo t){ //solo necesita recoger un valor. Al llamar al método, por ejemplo tiempo.suma(tiempo2), el valor que recogemos con this.horas es el valor de tiempo y el que recogemos con t.horas es el valor de tiempo2
        Tiempo t3 = new Tiempo(0);
        t3.horas = this.horas + t.horas;
        t3.minutos = this.minutos + t.minutos;
        t3.segundos = this.segundos + t.segundos;
        do {
            if (t3.segundos >= 60) {
                t3.minutos++;
                t3.segundos=t3.segundos - 60;
            }
            if (t3.minutos >= 60){
                t3.horas++;
                t3.minutos=t3.minutos - 60;
            }
        } while (t3.segundos>=60 || t3.minutos>=60);
        return t3;
    }


    public Tiempo resta (Tiempo t){
        Tiempo t3 = new Tiempo(0);
        t3.horas = this.horas - t.horas;
        t3.minutos = this.minutos - t.minutos;
        t3.segundos = this.segundos - t.segundos;

        do {
            if (t3.segundos<=-60) {
                t3.minutos++;
                t3.segundos=t3.segundos + 60;
            }
            if (t3.minutos<=-60){
                t3.horas++;
                t3.minutos=t3.minutos + 60;
            }
        } while (t3.segundos<=-60 || t3.minutos<=-60);
        return t3;
    }
}
