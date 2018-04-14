import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private String input;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void go() {
        String userInput;
        do {
            printMenu();
            input = scanner.nextLine();
            whatUserInput(input);
        } while (!input.equalsIgnoreCase("EXIT"));
    }

    private void printMenu() {
        System.out.println();
        System.out.println("---");
        System.out.println("WELCOME TO PROFFESIONAL CALCULATOR!");
        System.out.println("1: multiplication");
        System.out.println("2: division");
        System.out.println("EXIT: to exit applicaiton.");
        System.out.println("---");
        System.out.println();
    }

    private void whatUserInput(String input) {
        switch (input) {
            case "1": {
                System.out.println();
                System.out.println("Multiplication");
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter secund number: ");
                int b = scanner.nextInt();
                System.out.print("Result is: ");
                NumberOperation numberOperation = new NumberOperation();
                System.out.println(numberOperation.multiplication(a, b));
                System.out.println();
                break;
            }
            case "2": {
                System.out.println();
                System.out.println("Division");
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter secund number: ");
                int b = scanner.nextInt();
                System.out.print("Result is: ");
                NumberOperation numberOperation = new NumberOperation();
                System.out.println(numberOperation.division(a, b));
                System.out.println();
                break;
            }
        }

    }
}
