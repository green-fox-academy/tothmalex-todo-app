
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

    public class trial2 {

        public static void main(String [] args) {

            String argss = "-a FeedMonkey";

            String init = (argss.substring(argss.indexOf("a") + 2,argss.length()));

            try {
                Path filePath = Paths.get("src/ToDoList.txt");
                List<String> lines = Files.readAllLines(filePath);
                lines.add(init);
                Files.write(filePath, lines);
            } catch (IOException e) {
                System.out.println("Unable to write file: ToDoList.txt!");
            }
        }
    }
