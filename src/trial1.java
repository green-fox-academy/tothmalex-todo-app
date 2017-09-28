import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class trial1 {

    public static void main(String[] args) {
        File f = new File("src/ToDoList.txt");
        if (f.length() != 0) {
            try {
                Path filePath = Paths.get("src/ToDoList.txt");
                List<String> lines = Files.readAllLines(filePath);
                for (int i = 0; i < lines.size(); i++) {
                    System.out.println((i + 1) + " - " + lines.get(i));
                }
            } catch (Exception e) {
                //System.out.println("No todos for today! :)");
            }
        } else {
            System.out.println("No todos for today! :)");
        }
    }
}
