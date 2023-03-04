import java.util.ArrayList;
import java.util.List;

public class GCD {
    public static int compute(int x, int y) {
        int min = x > y? y : x;
        int result = 1;
        List<Integer> listInt = new ArrayList<>();
        for (int i = 1; i < min; i++) {
            if (x % i == 0 && (y % i) == 0) {
                listInt.add(i);
                x = x / i;
                y = y / i;
                if (i!=1) {
                    i--;
                }
            }
            if (i > x || i > y) {
                break;
            }
        }
        for (int a : listInt) {
            result *= a;
        }
        return result;
        //your code here
    }

    public static void main(String[] args) {
        System.out.println(compute(60, 12));
    }
}