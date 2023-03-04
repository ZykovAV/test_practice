import java.util.ArrayList;
import java.util.List;

public class PairOfGloves {
    public static void main(String[] args) {
        String[] array = {"red", "green", "red", "blue", "blue"};
//        result = 2 (1 red pair + 1 blue pair)

        String[] array2 = {"red", "red", "red", "red", "red", "red"};
//        result = 3 (3 red pairs)

    }
    public int testToPair(String[] array) {
        int redCount = 0;
        int greenCount = 0;
        int blueCount = 0;
        int glovesPairCount = 0;
        for (String s : array) {
            if (s.equals("red")) {
                redCount++;
            } else if (s.equals("green")) {
                greenCount++;
            } else if (s.equals("blue")) {
                blueCount++;
            }
        }
        System.out.println(redCount/2);
        System.out.println(greenCount/2);
        System.out.println(blueCount/2);
        return glovesPairCount = redCount/2 + greenCount/2 + blueCount/2;
    }
}
