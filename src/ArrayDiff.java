import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> resultList = new ArrayList<>();
        b = Arrays.stream(b).distinct().toArray();
        for (int firstArrayElement : a) {
            boolean isDifferent = true;
            for (int secondArrayElement : b) {
                if (firstArrayElement == secondArrayElement) {
                    isDifferent = false;
                    break;
                }
            }
            if (isDifferent) {
                resultList.add(firstArrayElement);
            }
        }
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] array = {4,5,6,3};
        int[] array2 = {0,3,2,3,3,3};
        System.out.println(Arrays.toString(arrayDiff(array, array2)));
    }
}
