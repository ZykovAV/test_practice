import java.util.Arrays;

public class XO {
    public static boolean getXO (String str) {
        int x_count = 0;
        int o_count = 0;
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (ch == 'x') {
                x_count++;
            } else if (ch == 'o') {
                o_count++;
            }
        }
        return x_count == o_count;
    }

    public static void main(String[] args) {
        boolean b = getXO("zxcxzxzxoipuiopiasdjnjxxoo");
        System.out.println(b);
        String str = "oxxxxxssd";
        int temp = str.replace("o","").length();
        int temp2 = str.replace("x","").length();
        System.out.println(temp);
        System.out.println(temp2);
        System.out.println(str);
    }
}
