package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSample {
    public static void createFile (String location, String fileName) {
        Path path = Paths.get(location, fileName);

        try{
            Files.createFile(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
    public static void createDirectory (String location) {
        Path path = Paths.get(location);

        try{
            Files.createDirectory(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
