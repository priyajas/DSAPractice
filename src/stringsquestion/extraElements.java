package stringsquestion;

import java.util.HashMap;

public class extraElements {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hellooo";
        findUniqueElement(str, str1);// should print oo
    }

    private static void findUniqueElement(String str, String str1) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str1.length(); i++) {
            hm.put(str1.charAt(i), hm.getOrDefault(str1.charAt(i), 0) - 1);
        }
        hm.forEach((key, value) -> {
            if (value != 0) {
                for (int i = 0; i < Math.abs(value); i++) {
                    System.out.println(key);
                }
            }
        });
    }
}
