package threads;

import org.w3c.dom.ls.LSOutput;

public class WorldPrinter implements Runnable{
    @Override

    public void run(){
        System.out.println(Thread.currentThread().getName() + " Hello World: ");
        doSomething();
    }
    public void doSomething(){
        System.out.println(Thread.currentThread().getName() + " Elmar");
    }

}
