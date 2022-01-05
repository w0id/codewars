package are_they_the_same;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        boolean result = true;
        int iter = 0;
        double squire = 0;
        for(int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (Math.sqrt(b[i]) == a[j]) break;
                iter++;
            }
            if (iter == a.length) {
                result = false;
                break;
            }else{
                iter = 0;
            }
        }
        return result;
    }
}
