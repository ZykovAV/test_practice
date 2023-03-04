public class Delete_Space_On_Message {
    public static void main(String[] args) {
        System.out.println(noSpace("88 sdas  sda "));
    }
    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}
