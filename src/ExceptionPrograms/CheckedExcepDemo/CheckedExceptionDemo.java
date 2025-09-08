package ExceptionPrograms.CheckedExcepDemo;

import java.io.IOException;

public class CheckedExceptionDemo {

    public static void readFile() throws IOException {
        // Simulate some error
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            readFile(); // Must handle or declare
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
    }

}


