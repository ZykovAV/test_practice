import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Temp {

    public static String greet(String name)
    {
        return "Hello, "+ name + " how are you doing today?";
        // Your code here
    }



    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        System.out.print(list.get(1)+":");
        list.add(1, "test4");
        System.out.println((list.get(1)+":"));
//        System.out.println(Arrays.toString(res));

    }
}
