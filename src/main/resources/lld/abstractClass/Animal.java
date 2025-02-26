package abstractClass;

public abstract class Animal {
    String name;
    int age;
    public void printName() {
        System.out.println(name);
    }
     abstract void move();
}
