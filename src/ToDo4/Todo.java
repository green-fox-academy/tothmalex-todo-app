package ToDo4;

public class Todo {

    public static void main(String[] args) {

        if (args.length == 0) {
            TodoList myTodo = new TodoList();
        } else if (args[0].startsWith("-l")) {
            TodoList myTodo = new TodoList("-l");
            try {
                myTodo.getList();
            } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Unsupported argument");
            }
        } else if (args[0].startsWith("-a")) {
            TodoList myTodo = new TodoList("-a");
            try {
                myTodo.setList(args[1]);
            } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Unsupported argument");
            }
        } else if (args[0].startsWith("-c")) {
            TodoList myTodo = new TodoList("-c");
            try {
                myTodo.checkItem(args[1]);
            } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Unsupported argument");
            }
        } else if (args[0].startsWith("-r")) {
            TodoList myTodo = new TodoList("-r");
            try {
                myTodo.removeItem(args[1]);
            } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Unsupported argument");
            }
        }
    }
}
