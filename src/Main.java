import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = false;

        System.out.println("Start Application");
        System.out.println("1: start | 2: nope");
        int startChoice = scanner.nextInt();

        if(startChoice == 1){
            isRunning = true; 
        }
        
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
        Task task;

        System.out.println("Welcome!");
        System.out.println("Choose an option");
        System.out.println("1. Create task");
        System.out.println("2. Add a task");
        System.out.println("3. List all tasks");
        System.out.println("4. Remove a task");
        System.out.println("5. Quit application");

        int choice = scanner.nextInt();

        switch(choice){
            case 1: 
                task = createTask();
                break;
            case 2:
                
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Bye!");
                return false;
        }
        return true;
    }

    static Task createTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Task name: ");
        String name = scanner.nextLine();

        Task task = new Task(name);
        return task;
    }
}