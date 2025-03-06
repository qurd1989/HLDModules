package abstractClass;

public class Dog extends Animal{
    void chasingCars(){
        System.out.println("chasing cars");
    }

    @Override
    public void move() {
        System.out.println("Walks like a dog ");
    }
}
