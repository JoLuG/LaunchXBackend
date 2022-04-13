package Semana1.Viernes;

class Animal2{
    void eat(){
        System.out.println("Comiendo...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Comiendo crequetas");
    }
}

class Cachorro extends Animal{
    void eat(){
        System.out.println("Tomando Agüita");
    }
}
public class Polimorfismo2 {
    public static void main(String[] args) {
        Animal dante;
        dante = new Animal();
        dante.eat();
        dante = new Dog();
        dante.eat();
        dante = new Cachorro();
        dante.eat();
    }
}
