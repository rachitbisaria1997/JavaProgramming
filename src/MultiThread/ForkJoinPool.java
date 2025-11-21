package MultiThread;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {


    private int[] arr;
    private int start, end;

    public SumTask(int[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        int sum = 0;
        for(int i=start; i < end; i++){
            sum += arr[i];
            return sum;
        }

        int mid = (start + end) / 2;

        SumTask left = new SumTask(arr, start, mid);
        SumTask right = new SumTask(arr, mid, end);

        left.fork();

        int rightresult = right.compute();
        int leftRes = left.join();

        return rightresult + leftRes;
    }
}

class ForkJoinPoolExample {

    public static void main(String[] args) {

//        Fork → Split a large task into smaller tasks
//
//        Join → Combine results of the smaller tasks

        ForkJoinPool pool = new ForkJoinPool();
        int[] arr = {1,2,3,4,5,6,7,8};

        SumTask task = new SumTask(arr, 0,arr.length);
        int result = pool.invoke(task);
        System.out.println("sum is "+ result);

        //✔ Supports deep recursion efficiently
        //✔ Ideal for parallel CPU-bound work

    }

}
