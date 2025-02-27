package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Client3 {

    public static void main(String[] args) throws Exception {

        FetchData fetchData = new FetchData("http://www.google.com");
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(10);

        Future<String> future = executorService.submit(fetchData);
        String name = future.get();
        fetchData.call();
    }
}
