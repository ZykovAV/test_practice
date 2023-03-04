public class Century {
    public static int Centrur(int year) {
        return (int)Math.ceil(year*0.01);
    }

    public static void main(String[] args) {
        int a = Centrur(2101);
        System.out.println(a);
        String s = "22!!";
        s = s.replaceAll("!", "");
        System.out.println(s);
    }
}
