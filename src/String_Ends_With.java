public class String_Ends_With {
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
    public static void main(String[] args) {
        Boolean s = solution("samurai", "a22i");
        System.out.println(s);
    }
}