
public class PhraseUpperCase {
    public String toJadenCase(String phrase) {
        String resultString = null;
        if (phrase == null || phrase.equals("")) {
            return null;
        } else {
            String[] tempString = phrase.split(" ");
            StringBuilder result = new StringBuilder();
            for (String s : tempString) {
                char[] array = s.toCharArray();
                for (int i = 0; i < array.length; i++) {
                    if (i == 0) {
                        String temp = String.valueOf(array[i]);
                        result.append(temp.toUpperCase());
                    } else {
                        result.append(array[i]);
                    }
                }
                result.append(" ");
                resultString = result.toString().substring(0, result.length()-1);
            }
            return resultString;
        }
    }

    public static void main(String[] args) {
        PhraseUpperCase solution = new PhraseUpperCase();
        String testPhrase = "toJadenCase doesn't return a valide JadenCase String! try again please :)";

        String irog = solution.toJadenCase(testPhrase);
        System.out.println(irog);

    }

}
