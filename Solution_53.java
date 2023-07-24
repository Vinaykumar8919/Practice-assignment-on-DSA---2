import java.math.BigInteger;

public class Solution {

    BigInteger converter(String s) {
        BigInteger value = BigInteger.ZERO;
        BigInteger digit = BigInteger.ONE;

        for (int i = s.length() - 1; i >= 0; i--) {
            int digitValue = Integer.parseInt(Character.toString(s.charAt(i)));
            BigInteger digitMultiplier = BigInteger.valueOf(digitValue);
            value = value.add(digitMultiplier.multiply(digit));
            digit = digit.multiply(BigInteger.TEN);
        }
        return value;
    }

    String multiply(String num1, String num2) {
        BigInteger multi = converter(num1).multiply(converter(num2));
        return multi.toString();
    }


}