import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        
        System.out.println("Welcome!");
        System.out.println("Choose an option");

        while(isRunning){
            isRunning = app.runApp();
        }
    }
}