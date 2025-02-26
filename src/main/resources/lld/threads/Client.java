package threads;

public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " ");
        WorldPrinter ps = new WorldPrinter();
        Thread t = new Thread(ps);//Creation of Thread
        ps.run();
        t.start(); //Starting to execute run method

        for (int i = 0; i < 100; i++) {
            int number  = i;
            Thread thread = new Thread(() -> {
                System.out.println("Printing number " + number + " using " + Thread.currentThread().getName());
                System.out.println("Printing number " + number + " using " + Thread.currentThread().getName());
            });
            thread.start();

        }
    }
}
