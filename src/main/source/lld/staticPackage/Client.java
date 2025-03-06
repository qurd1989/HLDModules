package staticPackage;

public class Client {
    public static void main(String[] args) {
        System.out.println(Dog.age);

        Dog.age = 10;
        Dog.doSomething();

        //Child class inherit method from parent
        BullDog.doSomething();
        System.out.println(BullDog.age);


        Dog d = new BullDog();
        d.doSomething();
        Dog.doSomething();
        d.print();
    }
}
