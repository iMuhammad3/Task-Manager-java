import java.util.Scanner;

public class Main {

    static Task task;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        
        System.out.println("Welcome!");
        System.out.println("Choose an option");
        while(isRunning){
            isRunning = startApp();
        }

        // Task task = new Task("My first task");
        // task.addTask("Wake up");        
        // task.addTask("Sleep");
        // task.addTask("Eat");

        // System.out.println(
        //     task.toString()
        // );

    }

    static boolean startApp(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Create task");
        System.out.println("2. Add a task");        
        System.out.println("3. Read from task");
        System.out.println("4. List all tasks");
        System.out.println("5. Remove a task");
        System.out.println("6. Quit application");

        int choice = scanner.nextInt();

        switch(choice){
            case 1: 
                task = createTask();
                break;
            case 2:
                System.out.println(task.toString());
                break;
            case 3:
                readTask();
                break;
            case 4:
                break;
            case 6:
                System.out.println("Bye!");
                return false;
            default: 
                System.out.println("Invalid option");
        }
        return true;
    }

    static Task createTask(){
        Scanner scanner = new Scanner(System.in);
        FileManipulation handler = new FileManipulation();
        System.out.println("Enter Task name: ");
        String name = scanner.nextLine();

        Task task = new Task(name);
        handler.createFile("/Users/mac/Desktop/Java/tasks/"+task.getName());
        return task;
    }
    static void readTask(){
        Scanner scanner = new Scanner(System.in);
        FileManipulation handler = new FileManipulation();
        System.out.println("Enter task name: ");
        String description = handler.readFile("/Users/mac/Desktop/Java/tasks/"+scanner.nextLine());
        System.out.println(description);
    }
}