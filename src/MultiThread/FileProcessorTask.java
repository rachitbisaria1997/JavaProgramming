package MultiThread;

import java.util.List;

public class FileProcessorTask implements Runnable{

    private List<String> linesBatch;

    public FileProcessorTask(List<String> linesBatch){
        this.linesBatch = linesBatch;
    }

    @Override
    public void run() {
        for(String line : linesBatch){
            processLine(line);
        }
    }

    private void processLine(String line){
        System.out.println(Thread.currentThread().getName() + " processed line of length "+ line.length());
    }
}
