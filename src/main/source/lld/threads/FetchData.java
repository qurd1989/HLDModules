package threads;

import java.util.concurrent.Callable;

public class FetchData implements Callable<String> {
    private String url;

    public FetchData(String url) {
        this.url = url;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Fetching data from " + url);
        return "Data from " + url;
    }
}
