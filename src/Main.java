public class Main {

    public static void main(String[] args) {

        //mnożenie
        Multiplication multiplication = new Multiplication();
        System.out.println(multiplication.Multiplication(5, 2));

        //dziesiętny na binarny
        DecimalBinary decimalBinary = new DecimalBinary();
        System.out.println(decimalBinary.DecimalToBinary(25));

        //logarytm
        Logarithm logarithm = new Logarithm();
        System.out.println(logarithm.Logarithm(2));
        //weryfikacja
        System.out.println(Math.log(2));

    }

}
