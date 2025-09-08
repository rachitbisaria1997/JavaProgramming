package FilesDemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

    public static void main(String[] args) throws IOException {

        Files.list(Paths.get(".")).forEach(System.out::println);

        Path currentDirectory = Paths.get(".");

        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");


        // below is used to walk over the directory path mentioned and filter the files by .java
        Files.walk(currentDirectory, 4)
                .filter(predicate)
                .forEach(System.out::println);

        // filter based on file type
        BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> String.valueOf(path).contains(".java");

        // filter based on directory
        BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
        Files.find(currentDirectory, 4, directoryMatcher).forEach(System.out::println);

    }

}
