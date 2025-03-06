package threads;

public class PrintNumbers  implements  Runnable{
    private int num;
    @Override
    public void run() {
        System.out.println(num + " Printing  using " + Thread.currentThread().getName());
    }
    public PrintNumbers(int num) {
        this.num = num;
    }

}
