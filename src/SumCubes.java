public class SumCubes {
    public static long sumCubes(long n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            long temp = i*i*i;
            result +=temp;
        }
        return result;
        //put your code here :D
    }
    public static void main(String[] args) {
        long a = 123123123123L;
        System.out.println(sumCubes(a));
    }
}
