package abstractClass;

public class Client {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog dog = new Dog();
        a.move();
        dog.chasingCars();
        Animal b = new BullDog();
        a.printName();
        b.move();

    }
}
