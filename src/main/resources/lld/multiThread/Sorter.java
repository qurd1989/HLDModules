package multiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> list;

    public Sorter(List<Integer> list) {
        this.list = list;
    }

    @Override
    public List<Integer> call() throws Exception {
       if (list.size() <=1){
           return list;
       }
       List<Integer> left = new ArrayList<>();
         List<Integer> right = new ArrayList<>();

         for (int i = 0; i < list.size()/2; i++) {
             left.add(list.get(i));
         }
            for (int i = list.size()/2; i < list.size(); i++) {
                right.add(list.get(i));
            }
            Sorter leftSorter = new Sorter(left);
            Sorter rightSorter = new Sorter(right);

        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(10);

        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);

        return list;
    }

}
