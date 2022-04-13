package Semana1.Viernes;

class Animal{
    //Caso1
    String color = "Blanco";

    //Caso 2
    void eat(){
        System.out.println("Comiendo...");
    }
    //Caso 3
    Animal(){
        System.out.println("Se crea un animal");
    }
}

class Gato extends Animal{
    //Caso1
    String color = "Cafe";
    void printColor(){
        System.out.println("Color de la clase Gato: "+color);
        System.out.println("Color de la clase animal: "+super.color);
    }

    //Caso2
    void cat(){
        System.out.println("Como atun");
    }

    void sleep(){
        System.out.println("Ya se durmio el michi");
    }

    void call(){
        super.eat();
        sleep();
    }

    Gato(){
        super();
        System.out.println("Se ha creado un gato");
    }



}
public class SuperTest {
    public static void main(String[] args) {
        //Caso1
        //new Gato().printColor();

        //Caso 2
        //new Gato().call();

        //Caso 3
        new Gato();
    }
}
