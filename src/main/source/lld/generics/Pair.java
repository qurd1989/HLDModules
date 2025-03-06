package generics;

import org.w3c.dom.ls.LSOutput;

public class Pair <T, V> {
    T a;
    V b;

    static void pirntPi(){
        final double PI = 3.14159;
        System.out.println("PI: " + PI);
    }
    static Double findCircleArea(double radius){
        final double PI = 3.14159;
      return PI * radius * radius;
    }

    static <E> void printCircleArea(E radius){
        System.out.println("Circle Area: " + findCircleArea((Double) radius));
    }

    Pair(T a, V b) {
        this.a = a;
        this.b = b;
    }

    void  setA(T a) {
        this.a = a;
    }
      T  getA() {
        return a;
    }
    void setB(V b) {
        this.b = b;
    }
    V getB() {
        return b;
    }
}
