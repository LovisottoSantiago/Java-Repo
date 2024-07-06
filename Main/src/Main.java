import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello World!");
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is " + name);

        if ("joselu".equalsIgnoreCase(name)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Bye!");
        }


    }

}


