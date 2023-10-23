import java.util.Scanner;

public class App {
    App(){}

    String DirectoryPath = "/Users/mac/Desktop/Java/tasks/";

    boolean runApp(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Create task");
        System.out.println("2. Read task content");
        System.out.println("3. List all tasks");
        System.out.println("4. Delete a task");
        System.out.println("5. Quit application");

        int choice = scanner.nextInt();

        switch(choice){
            case 1: 
                createTask();
                break;
            case 2:
                readTaskContent();
                break;
            case 3:
                System.out.println("Currently unavailable");
                break;
            case 4:

                break;
            case 5:
                System.out.println("Bye!");
                return false;
            default: 
                System.out.println("Invalid option");
        }
        return true;
    }

    void createTask(){
        Scanner scanner = new Scanner(System.in);
        FileManipulation handler = new FileManipulation();
        System.out.println("Enter Task name: ");
        String name = scanner.nextLine();

        Task task = new Task(name);
        handler.createFile(DirectoryPath+task.getName());
        System.out.println(task.toString());
    }
    void readTaskContent(){
        Scanner scanner = new Scanner(System.in);
        FileManipulation handler = new FileManipulation();
        System.out.println("Enter task name: ");
        String description = handler.readFile(DirectoryPath+scanner.nextLine());
        System.out.println(description);
    }
    String listAllTask(){
        return "";
    }
    void deleteTask(){
        Scanner scanner = new Scanner(System.in);
        FileManipulation handler = new FileManipulation();
        System.out.println("Enter task name: ");
        handler.deleteFile(scanner.nextLine());
    }
    
}
