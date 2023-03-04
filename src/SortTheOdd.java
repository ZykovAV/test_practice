import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortArr(int[] array) {
        int[] tempArray = new int[array.length];
        for (int i = 0; i < tempArray.length; i++) {
            if (array[i]%2!=0) {
                tempArray[i] = array[i];
            }
        }
        int[] valueArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if(tempArray[i] != 0) {
                valueArray[j] = array[i];
                j++;
            }
        }
        valueArray = Arrays.stream(valueArray).sorted().toArray();
        int[] valueArray2 = new int[array.length];
        int k = 0;
        for (int value : valueArray) {
            if (value != 0) {
                valueArray2[k] = value;
                k++;
            }
        }
        int[] resultArray = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(valueArray));
        int n = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (resultArray[i]%2!=0) {
                resultArray[i] = valueArray2[n];
                n++;
            }
        }
        System.out.println("original : " + Arrays.toString(array));
//        System.out.println("Positions : " + Arrays.toString(indexArray));
//        System.out.println("Values : " + Arrays.toString(valueArray));
        System.out.println("resulttt : " + Arrays.toString(resultArray));
        return resultArray;
    }

    public static void main(String[] args) {
//        int[] myArray = {0, 1, 3, 5};
        int[] myArray = {0, 9, 0, 0, 8, 11, 9, 12, 3, 13};
        sortArr(myArray);
    }
}
