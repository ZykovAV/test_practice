import java.util.*;

public class OrderedCount {
    //    public static List<Pair<Character, Integer>> orderedCount(String text) {
//        return null;
//    }
    public static void main(String[] args) {
        String s = "abracadabra";
        byte[] array = s.getBytes();
//        List<Character> charList = new ArrayList<>();
//        for (byte b : array) {
//            charList.add((char) b);
//        }
//        Set<Character> charSet = new HashSet<>();
//        for (byte b : array) {
//            charSet.add((char) b);
//        }
        Map<String, Integer> charMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            charMap.put(String.valueOf((char) array[i]), 0);
        }
        for (int i = 0; i < array.length; i++) {
            if (charMap.containsKey(String.valueOf((char) array[i]))) {
                int temp = charMap.get(String.valueOf((char) array[i]));
                temp++;
                charMap.put(String.valueOf((char) array[i]), temp);
            }
        }
        System.out.println(charMap.containsKey("a"));
        System.out.println(charMap);
//        System.out.println(charList);
//        System.out.println(charSet);

    }
}
