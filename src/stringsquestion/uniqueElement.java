package stringsquestion;

public class uniqueElement {

    public static void main(String[] args) {
        String str = "abcAbC1232&*";// a and A are considered as different characters
        findUniqueElement(str);// should print acAC
    }

    private static void findUniqueElement(String str) {
        char[] ch = new char[256];

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                ch[(str.charAt(i) - 'A')]++;
            }
        }
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] == 1) {
                System.out.println((char) (j + 'A'));
            }
        }

    }
}
