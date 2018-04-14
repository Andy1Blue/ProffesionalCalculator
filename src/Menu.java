/**
 * Logika menu
 */

import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private int input;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void go() {
        do {
            printMenu();
            System.out.print("What you need to do? Choose number: ");
            input = scanner.nextInt();
            whatUserInput(input);
        } while (input == 0);
    }

    private void printMenu() {
        System.out.println();
        System.out.println("---");
        System.out.println("WELCOME TO PROFFESIONAL CALCULATOR!");
        System.out.println("You can enter only a number!");
        System.out.println("1: multiplication");
        System.out.println("2: division");
        System.out.println("3: declimal to binary");
        System.out.println("4: binary to octal");
        System.out.println("5: sinus");
        System.out.println("6: cosinus");
        System.out.println("7: logarithm");
        System.out.println("8: element");
        System.out.println("0: to exit application");
        System.out.println("---");
        System.out.println();
    }

    private void whatUserInput(int input) {
        switch (input) {
            case 1: {
                sayWhatUserInput(input);
                doMultiplication();
                break;
            }
            case 2: {
                sayWhatUserInput(input);
                doDivision();
                break;
            }
            case 3: {
                sayWhatUserInput(input);
                doDecToBin();
                break;
            }
            case 4: {
                sayWhatUserInput(input);
                doBinToOctal();
                break;
            }
            case 5: {
                sayWhatUserInput(input);
                doSinus();
                break;
            }
            case 6: {
                sayWhatUserInput(input);
                doCosinus();
                break;
            }
            case 7: {
                sayWhatUserInput(input);
                doLogarithm();
                break;
            }
            case 8: {
                sayWhatUserInput(input);
                doElement();
                break;
            }
            case 0: {
                sayWhatUserInput(input);
                System.out.println("Bye bye!");
                System.exit(0);
                break;
            }
            default: {
                System.out.println("This is not a good idea! Try again!");
                go();
                break;
            }
        }

    }

    private void doBinToOctal() {
        System.out.println();
        System.out.println("Binary to octal");
        System.out.print("Enter binary number: ");
        int a = scanner.nextInt();
        System.out.print("Octal number is: ");
        BinaryOctal binaryOctal = new BinaryOctal();
        System.out.println(binaryOctal.binaryToOctal(a));
        System.out.println();
        go();
    }

    private void sayWhatUserInput(int input) {
        System.out.println("You have entered: " + input);
    }

    private void doMultiplication() {
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
    }

    private void doDivision() {
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
    }

    private void doDecToBin() {
        System.out.println();
        System.out.println("Declimal to binary");
        System.out.print("Enter declimal number: ");
        int a = scanner.nextInt();
        System.out.print("Binary number is: ");
        DecimalBinary decimalBinary = new DecimalBinary();
        System.out.println(decimalBinary.decimalToBinary(a));
        System.out.println();
        go();
    }

    private void doSinus() {
        System.out.println();
        System.out.println("Sinus");
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Sinus is: ");
        CosSin cosSin = new CosSin();
        System.out.println(cosSin.sin(a));
        System.out.println();
        go();
    }

    private void doCosinus() {
        System.out.println();
        System.out.println("Cosinus");
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Cosinus is: ");
        CosSin cosSin = new CosSin();
        System.out.println(cosSin.cos(a));
        System.out.println();
        go();
    }

    private void doLogarithm() {
        System.out.println();
        System.out.println("Logarithm");
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Logarithm is: ");
        Logarithm logarithm = new Logarithm();
        System.out.println(logarithm.logarithm(a));
        System.out.println();
        go();
    }

    private void doElement() {
        System.out.println();
        System.out.println("Element");
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("The element from the number " + a + " is: ");
        Element element = new Element();
        System.out.println(element.element(a));
        System.out.println();
        go();
    }

}
