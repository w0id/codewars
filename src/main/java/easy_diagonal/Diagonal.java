package easy_diagonal;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;

import java.math.BigInteger;

import java.util.Arrays;

public class Diagonal {
    public static BigInteger diagonal(int n, int p) {
        // your code
//        int[] a = new int[n + 2];
//        Arrays.fill(a, 1);
//        for (int i = 0; i < n + 1; i++) {
//            for (int j = 0; j < a.length-2; j++) {
//                a[j + 1] = a[j + 1] + a[j];
//            }
//            a = Arrays.copyOf(a, a.length - 1);
//            if (a.length - 2 == p) {
//                return BigInteger.valueOf(a[a.length - 1]);
//            }
//        }
//        return BigInteger.valueOf(-1);

//        int binom = 1;
//        for (int i = 1, previous = 1; i < n - p + 1; i++) {
//            binom += previous =previous * (p + i) / i;
//        }
//        return BigInteger.valueOf(binom);
        BigInteger binom = BigInteger.valueOf(1);
        for (BigInteger i = BigInteger.valueOf(1), previous = valueOf(1); i.intValue() < n - p + 1; i = i.add(valueOf(1))) {
            binom = binom.add(previous = previous.multiply(i.add(valueOf(p))).divide(i));
        }
        return binom;
    }
}