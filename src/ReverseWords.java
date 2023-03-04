import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(final String original) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        String[] wordArray = original.split(" ");
        if (wordArray.length < 1) {
            byte[] byteArray = original.getBytes();
            for (byte b : byteArray) {
                sb1.append((char) b);
            }
            return sb1.toString();
        } else {
        for (int i = 0; i < wordArray.length; i++) {
            String[] array = wordArray[i].split("");
            for (int j = 0; j < array.length; j++) {
                sb.append(array[array.length-1-j]);
            }
            sb.append(" ");
        }
        // Have at it
        return sb.toString().substring(0, sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("double  spaces")); /* "elbuod  secaps" */
//        reverseWords("    ");
    }
}