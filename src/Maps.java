import java.util.Arrays;

public class Maps {
//    public static int[] map(int[] arr) {
//        int[] resultArray = new int[arr.length];
//        for (int i = 0; i< arr.length; i++) {
//            resultArray[i] = arr[i]*2;
//        }
//        return resultArray;
//    }
public static int[] map(int[] arr) {
    return Arrays.stream(arr).map(x -> x*2).toArray();
}

    public static void main(String[] args) {
        int[] mas = new int[] {4, 1, 1, 1, 4};
        System.out.println(Arrays.toString(map(mas)));

    }
}
