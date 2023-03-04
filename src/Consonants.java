
public class Consonants {
    public static int getCount(String str) {
        int count = 0;
        str = str.replaceAll("[^a-zA-Z]", "");
        String[] array = str.split("");
        if (str.trim().isEmpty()) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (!(array[i].equals("a") || array[i].equals("e") || array[i].equals("i") || array[i].equals("o") || array[i].equals("u"))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a = Consonants.getCount("    aaauu  sd");
        System.out.println(a);
    }
}