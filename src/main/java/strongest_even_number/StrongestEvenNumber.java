package strongest_even_number;

import java.util.Arrays;

public class StrongestEvenNumber {


    public static int strongestEven(int n, int m) {
//        int count = 0;
//        int[] counts;
//        counts = new int[m-n];
//        do {
//            for (int j = 0; (n >> j) % 2 == 0; j++) {
//                counts[count] = j;
//            }
//            n++;
//            count++;
//        } while (n < m);
//        return Arrays.stream(counts).max();

//        int strongest = 0;
//        int count = 0;
//        for (int i = n; i <= m; i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; (i >> j) % 2 == 0; j++) {
//                    if (j >= count) {
//                        count = j;
//                        strongest = i;
//                        //System.out.println(i + " " + j);
//                    }
//                }
//            }
//        }
//        return strongest;

        int mid = 1;
        while (true) {
            int minval = n / mid + (n % mid == 0 ? 0 : 1);
            int maxval = m / mid;
            if (minval > maxval) {
                mid = mid / 2;
                return mid * (m / mid);
            }
            mid *= 2;
        }
    }
}
