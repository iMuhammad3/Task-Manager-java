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
//            startApp();
        }

    }
}