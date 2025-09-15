package MultiThread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LargeFileProcessor {

    private static final int BATCH_SIZE = 1000;
    private static final int THREAD_POOL_SIZE = 4;


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        try(BufferedReader reader = new BufferedReader(new FileReader("largefile.txt"))){

            List<String> linesBatch = new ArrayList<>(BATCH_SIZE);
            String line;

            while((line = reader.readLine()) != null){

                linesBatch.add(line);

                if(linesBatch.size() >= BATCH_SIZE){

                    // submit the task to thread pool
                    executorService.submit(new FileProcessorTask(new ArrayList<>(linesBatch)));
                    linesBatch.clear();
                }
            }

            if(!linesBatch.isEmpty()){
                executorService.submit(new FileProcessorTask(new ArrayList<>(linesBatch)));
            }

        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }

    }
}


//Reduces frequent thread creation overhead. Processes multiple lines at once.
//Prevents spawning too many threads (which harms CPU/RAM), controls concurrency.
//Manages threads, avoids excessive context switching, and handles work queue properly.