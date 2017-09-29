import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Remove {

    public void remove(String input) {

        Path myPath = Paths.get("ToDoList.txt");
        int index = Integer.parseInt(input);

        if (input != " ") {
            try {
                List<String> lines = Files.readAllLines(myPath);
                if (lines.size() > index)
                    try {
                        lines.remove((index - 1));
                    } catch (NumberFormatException e) {
                        System.out.println("Unable to remove: index is not a number");
                    }
                else {
                    System.out.println("Unable to remove: index is out of bound!");
                }
                Files.write(myPath, lines);
            } catch (IOException e) {
                System.out.println("Unable to read file.");
            }
        } else {
            System.out.println("Unable to remove: no index provided");
        }
    }
}