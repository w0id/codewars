package find_the_odd_int;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {
        int[] c = Arrays.stream(a).distinct().toArray();
        int result;
        for(final int num:c) {
            if ((int) Arrays.stream(a).filter(x -> x == num).count() % 2 != 0) {
                return num;
            }
        }
        return 0;
    }
}
