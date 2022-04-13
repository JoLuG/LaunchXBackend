package Semana1.Viernes;

public class Empleado {
    double salario = 40000;
}
class Programador extends Empleado{
    int bono = 1000;

    public void main(){
        Programador pro = new Programador();
        System.out.println("El salario del programador es: "+
                pro.salario);
        System.out.println("El bono del programador es: "+
                pro.bono);
    }
    void mensaje(){
        System.out.println("Soy progrmador");
        main();
    }
}

class Web extends Programador{
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();

    }
}