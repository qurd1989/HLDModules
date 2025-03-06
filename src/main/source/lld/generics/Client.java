package generics;

public class Client {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "One");
        System.out.println(pair.getA());
        System.out.println(pair.b);

        // This is the raw use of Pair class, which is not recommended
        Pair pair1 = new Pair(1, "One");
    }
}
