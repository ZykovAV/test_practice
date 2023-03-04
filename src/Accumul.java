import java.util.Arrays;

public class Accumul {

    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        String[] arrayBukav = new String[s.length()];
        for (int i = 0; i < arrayBukav.length; i++) {
            arrayBukav[i] = s.substring(a++, ++b).toUpperCase();
        }
        int c = 1;
        for (int i = 1; i < arrayBukav.length+1; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    sb.append(arrayBukav[i-1].toUpperCase());
                } else {
                    sb.append(arrayBukav[i-1].toLowerCase());
                }
            }
            if (i != arrayBukav.length) {
                sb.append("-");
            }
        }
        return sb.toString();
        // your code
    }

    public static void main(String[] args) {
        String result = accum("cwAt"); //"A-Bb-Ccc-Dddd"
        System.out.println(result);
    }
}