import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        return 0;
        //Your code
    }

    public static void main(String[] args) {
        int num = 123345;
        String tempString = String.valueOf(num);
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < tempString.length(); i++) {
            String temp = tempString.substring(i, ++j);
            stringList.add(temp);
        }
        for (String string : stringList) {
            integerList.add(Integer.valueOf(string));
        }
        Object[] array = integerList.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((int) o1 == (int) o2) {
                    return 0;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }).toArray();
        StringBuilder sb = new StringBuilder();
        for (Object tempInt : array) {
            sb.append(tempInt);
        }
        int result = Integer.valueOf(sb.toString());
    }

}
