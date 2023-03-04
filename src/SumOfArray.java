import java.util.Arrays;

public class SumOfArray {
    public static int sum(int[] numbers) {
        if (numbers != null){
            int summa = 0;
            numbers = Arrays.stream(numbers).sorted().toArray();
            for (int i = 1; i < numbers.length - 1; i++) {
                summa += numbers[i];
            }
            return summa;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] abc = new int[0];
        int a = sum(abc);
        System.out.println(a);
    }
}
