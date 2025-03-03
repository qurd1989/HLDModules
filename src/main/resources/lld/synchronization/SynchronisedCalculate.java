package synchronization;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class SynchronisedCalculate {
    int val;
    public static void main(String[] args) {


    }

    public synchronized void calculate() {getSum();
    }
    @Test
    public void givenMultiThread_whenNonSyncMethod() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        SynchronisedCalculate method = new SynchronisedCalculate();

        IntStream.range(0, 1000)
                .forEach(count -> service.submit(method::calculate));
                service.awaitTermination(1000, TimeUnit.MILLISECONDS);

                assertEquals(1000, method.getSum());
    }

    private int getSum() {

        return val++;
    }
}
