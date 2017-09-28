
public class ToDoList {

    public static void main(String[] args) {
        // Check how many arguments were passed in

        if (args.length == 0) {
            System.out.println("Command Line Todo application");
            System.out.println("=============================");
            System.out.println("Command line arguments:");
            System.out.println("-l   Lists all the tasks");
            System.out.println("-a   Adds a new task");
            System.out.println("-r   Removes an task");
            System.out.println("-c   Completes an task");
        } else {}

        Task tasks = new Task();
        AddNew add = new AddNew();
        AddNew argsadd = new AddNew();

        if (args[0].equals("-l")) {
            tasks.tasks();
        }if (args[0].equals("-a")) {
            add.adding(args);
        }
    }
}