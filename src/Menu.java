import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private Integer input;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void go() {
        do {
            printMenu();
            input = scanner.nextInt();
            whatUserInput(input);
        } while (input == 0);
    }

    private void printMenu() {
        System.out.println();
        System.out.println("---");
        System.out.println("WELCOME TO PROFFESIONAL CALCULATOR!");
        System.out.println("1: multiplication");
        System.out.println("2: division");
        System.out.println("3: declimal to binary");
        System.out.println("4: sinus");
        System.out.println("5: cosinus");
        System.out.println("6: logarithm");
        System.out.println("0: to exit application.");
        System.out.println("---");
        System.out.println();
    }

    private void whatUserInput(int input) {
        switch (input) {
            case 1: {
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
                go();
                break;
            }
            case 2: {
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
                go();
                break;
            }
            case 3: {
                System.out.println();
                System.out.println("Declimal to binary");
                System.out.print("Enter declimal number: ");
                int a = scanner.nextInt();
                System.out.print("Binary number is: ");
                DecimalBinary decimalBinary = new DecimalBinary();
                System.out.println(decimalBinary.decimalToBinary(a));
                System.out.println();
                go();
                break;
            }
            case 4: {
                System.out.println();
                System.out.println("Sinus");
                System.out.print("Enter number: ");
                int a = scanner.nextInt();
                System.out.print("Sinus is: ");
                CosSin cosSin = new CosSin();
                System.out.println(cosSin.sin(a));
                System.out.println();
                go();
                break;
            }
            case 5: {
                System.out.println();
                System.out.println("Cosinus");
                System.out.print("Enter number: ");
                int a = scanner.nextInt();
                System.out.print("Cosinus is: ");
                CosSin cosSin = new CosSin();
                System.out.println(cosSin.cos(a));
                System.out.println();
                go();
                break;
            }
            case 6: {
                System.out.println();
                System.out.println("Logarithm");
                System.out.print("Enter number: ");
                int a = scanner.nextInt();
                System.out.print("Logarithm is: ");
                Logarithm logarithm = new Logarithm();
                System.out.println(logarithm.logarithm(a));
                System.out.println();
                go();
                break;
            }
            case 0: {
                System.out.println("Bye bye!");
                break;
            }
        }

    }
}
