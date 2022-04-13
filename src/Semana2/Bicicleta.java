package Semana2;

abstract class Mountain{
    Mountain(){
        System.out.println("Se he creado una bicicleta de Montaña");
    }
    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("Cambiando color a  rojo");
    }
}

class Magistroni extends Mountain{
    @Override
    void cambiarVelocidad() {
        System.out.println("Se deben desbloquear las perillas del manubrio primero");
    }
}



public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bicicleta1= new Magistroni();
        bicicleta1.cambiarVelocidad();
        bicicleta1.cambiarColor();
    }
}
