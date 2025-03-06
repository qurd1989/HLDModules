package threads;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;

public class Client2 {
    public static void main(String[] args) {
        ExecutorService excuterService = Executors.newFixedThreadPool(10);
        for ( int i = 0; i < 10000; i++) {
            if (i  == 80){
                System.out.println("I am 80");
            }
            PrintNumbers printNumbers = new PrintNumbers(i);
            Thread thread = new Thread(printNumbers);
            excuterService.execute(thread);
        }
    }
}
