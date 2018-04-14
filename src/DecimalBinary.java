// dziesiętny na binarny

public class DecimalBinary {

    public String decimalToBinary(int n) {
        int count = 0;
        int a;
        String x = "";
        while (n > 0) {
            a = n % 2;
            if (a == 1) {
                count++;
            }
            x = x + "" + a;
            n = n / 2;
        }
        return x;
    }

}
