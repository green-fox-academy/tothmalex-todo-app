import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddNew {

    public void adding (String [] args) {

        StringBuffer result = new StringBuffer();
        for (int i = 1; i < args.length; i++) {
            result.append(args[i] + " ");
        }
        String init = result.toString();

        if (!init.isEmpty()) {
            try {
                Path filePath = Paths.get("ToDoList.txt");
                List<String> lines = Files.readAllLines(filePath);
                lines.add(init);
                Files.write(filePath, lines);
            } catch (IOException e) {
                System.out.println("Unable to write file: ToDoList.txt!");
            }
        } else {
            System.out.println("Unable to add: no task provided");
        }
    }
}


    /*Given the terminal opened in the project directory
    When the application is ran with the -a "Feed the monkey" argument
        Then it should add a new task with the description Feed the monkey*/