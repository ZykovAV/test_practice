import java.util.Arrays;

public class SheepsArray {
    public static void main(String[] args) {
        SheepsArray sheepsArray = new SheepsArray();
        Boolean[] array1 = null;
        int a = sheepsArray.countSheeps(array1);
        System.out.println(a);

    }


    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i ++) {
            if (arrayOfSheeps[i] == null) {
                break;
            }
            if (arrayOfSheeps[i] == true) {
                count++;
            }
        }
        return count;
    }
    public int countSheeps2(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).filter(x -> x != null).filter(x -> x == true).toArray().length;
    }
}
