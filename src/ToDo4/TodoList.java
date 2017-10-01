package ToDo4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private ListofItems myTodoList;

    public TodoList() {
        myTodoList = new ListofItems();
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println("");
        System.out.println("Command line arguments:");
        System.out.println("-l   Lists all the tasks");
        System.out.println("-a   Adds a new task");
        System.out.println("-r   Removes a task");
        System.out.println("-c   Completes a task");
        System.out.println("");
    }

    public TodoList(String input) {
        myTodoList = new ListofItems();
    }

    public void getList() {
        Path path = Paths.get("C:/Users/PC-DJ/Documents/GreenFox/janosdobi-todo-app/src/Data.txt");
        try {
            List<String> myList = Files.readAllLines(path);
            if (myList.size() == 0) {
                System.out.println("No todos for today!");
            } else {
                for (int i = 0; i < myList.size(); i++) {
                    myTodoList.addItem(new Item(myList.get(i)));
                    System.out.println(i + 1 + " - " + myTodoList.getItem(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setList(String input) {
        Path path = Paths.get("C:/Users/PC-DJ/Documents/GreenFox/janosdobi-todo-app/src/Data.txt");

        try {
            List<String> myList = Files.readAllLines(path);
            for (int i = 0; i < myList.size(); i++) {
                myTodoList.addItem(new Item(myList.get(i)));
            }
            myTodoList.addItem(new Item(input));
            List<String> myOutputList = new ArrayList<>();
            for (int i = 0; i < myTodoList.size(); i++) {
                myOutputList.add(myTodoList.getItem(i).toString());
            }
            Files.write(path, myOutputList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkItem(String checkIndex) {
        Path path = Paths.get("C:/Users/PC-DJ/Documents/GreenFox/janosdobi-todo-app/src/Data.txt");
        try {
            List<String> myList = Files.readAllLines(path);
            for (int i = 0; i < myList.size(); i++) {
                myTodoList.addItem(new Item(myList.get(i)));
                if (i == Integer.parseInt(checkIndex) - 1) {
                    myTodoList.getItem(i).complete();
                }
            }
            List<String> myOutputList = new ArrayList<>();
            for (int i = 0; i < myTodoList.size(); i++) {
                myOutputList.add((myTodoList.getItem(i).toString().charAt(1) == 'x' ? "[x]" : (myTodoList.getItem(i).completed ? "[x] " : "[ ] ")) + myTodoList.getItem(i).toString().substring(4));
            }
            Files.write(path, myOutputList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeItem(String checkIndex) {
        Path path = Paths.get("C:/Users/PC-DJ/Documents/GreenFox/janosdobi-todo-app/src/Data.txt");
        try {
            List<String> myList = Files.readAllLines(path);
            for (int i = 0; i < myList.size(); i++) {
                myTodoList.addItem(new Item(myList.get(i)));
                if (i == Integer.parseInt(checkIndex) - 1) {
                    myTodoList.removeItem(i);
                }
            }
            List<String> myOutputList = new ArrayList<>();
            for (int i = 0; i < myTodoList.size(); i++) {
                myOutputList.add(myTodoList.getItem(i).toString());
            }
            Files.write(path, myOutputList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}