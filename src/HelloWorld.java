import java.util.Arrays;

public class HelloWorld {
    public static String greet() {
        String[] hello = {"h", "e", "l", "l", "o", " ", "w", "o", "r", "l", "d", "!"};
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(hello).forEach(str -> stringBuilder.append(str));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(greet());
    }
    // Write a public static function `greet` that returns "hello world!"
}
