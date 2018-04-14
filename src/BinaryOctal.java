/**
 * Binarny i ósemkowy
 */

public class BinaryOctal {

    public int binaryToOctal(long a) {
        int octalNumber = 0;
        int decimalNumber = 0;
        int i = 0;

        while (a != 0) {
            decimalNumber += (a % 10) * Math.pow(2, i);
            ++i;
            a /= 10;
        }

        i = 1;

        while (decimalNumber != 0) {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }

        return octalNumber;
    }

}
