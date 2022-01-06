package are_they_the_same;

import java.util.stream.IntStream;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        boolean result;
        result = !(a == null || b == null);
        if (result) {
            result = !(a.length == 0 || b.length == 0);
        }else{
            return result;
        }
        for (final int current : a) {
            if (result) {
                result = IntStream.of(b).anyMatch(x -> x == Math.pow(current, 2));
            } else {
                break;
            }
        }
        for (final int current : b) {
            if (result) {
                result = IntStream.of(a).anyMatch(x -> x == Math.sqrt(current));
            } else {
                break;
            }
        }
        return result;
    }
}
