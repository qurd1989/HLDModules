package multiThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(3,4,5,6,7,8,9,10,11,12,13,14,16,45, 67, 17,18,19,20));
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(10);
        Sorter sorter = new Sorter(arr);
        Future<List<Integer>> future = executorService.submit(sorter);
        try {
            List<Integer> sortedList = future.get();
            for (int i = 0; i < sortedList.size(); i++) {
                System.out.print(sortedList.get(i)+ "  ");
            }
            System.out.println(sortedList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
 * What is the output?
 * return list;
 */
}

