import java.util.Scanner;

public class YLabLesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i < a; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }

}
