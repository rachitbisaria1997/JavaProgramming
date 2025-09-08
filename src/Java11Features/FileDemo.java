package Java11Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("sample.txt");
        Files.writeString(path, "Hello java 11");
        String content = Files.readString(path);
        System.out.println(content);


        // new Files methods - readString, writeString
    }

}
