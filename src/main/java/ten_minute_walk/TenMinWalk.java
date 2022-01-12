package ten_minute_walk;

import java.util.Arrays;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        return walk.length == 10
                && new String(walk).chars().filter(x -> x == 'n').count() == new String(walk).chars().filter(x -> x == 's').count()
                && new String(walk).chars().filter(x -> x == 'e').count() == new String(walk).chars().filter(x -> x == 'w').count()
                ? true : false;
    }
}
