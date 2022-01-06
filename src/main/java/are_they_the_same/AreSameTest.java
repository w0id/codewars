package are_they_the_same;

public class AreSameTest {

    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
//        int[] a = null;
//        int[] b = {};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(AreSame.comp(a, b));
    }
}
