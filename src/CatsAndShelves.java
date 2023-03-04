public class CatsAndShelves {
    public static int jumpCount(int start, int finish) {
        int count = 0;
        while ((start+3) <= finish) {
            start+=3;
            count++;
        }
        while ((start+1 <= finish)) {
            start++;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int res = jumpCount(1,5);
        System.out.println(res);
    }
}
