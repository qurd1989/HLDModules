package demo;

public class CounterDemo {

    public static void main(String args[]) {
        Counter counter;
        counter = new Counter();
        counter.increment();
        System.out.println(counter.getCount());
        Counter counter1 = new Counter(10);
        System.out.println(counter1.getCount());
        counter1.decrement();
        System.out.println(counter1.getCount());

    }
}
