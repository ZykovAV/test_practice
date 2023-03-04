import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static int[] minMax(int[] arr) {
        List<Integer> listInteger = Arrays.stream(arr).sorted().boxed().toList();
        int a = listInteger.get(0);
        int b = listInteger.get(listInteger.size()-1);
        return new int[]{a,b};
    }

    public static void main(String[] args) {


    }
}
