import Files.FileSample;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class FileSampleTest {
    @Test
    public void testCreateFile() {
        String fileName = "sample.txt";
        String location = "C:\\Users\\User\\IdeaProjects\\Practice\\Files\\sample.txt";

        FileSample.createFile(location, fileName);

        Path path = Paths.get(location, fileName);
        assertTrue(Files.exists(path));
    }


    public void testCreateDirectory() {
        String location = "C:\\Users\\User\\IdeaProjects\\Practice\\Files\\sample.txt";

        FileSample.createDirectory(location);

        Path path = Paths.get(location);
        assertTrue(Files.exists(path));
    }
}

