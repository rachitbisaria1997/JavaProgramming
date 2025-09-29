package MultiThread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("Imp.txt"))){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        // No need to explicitly close br → done automatically
    }
    // it ensures that resource management lyk DB connections, sockets, streams are automatically done when the block ends.
    // it eliminates the need for writing finally blocks
}
