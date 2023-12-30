package numberquestions;

public class armStrongNumber {
    public static void main(String[] args) {
        findArmStrongNumber();
    }

    private static void findArmStrongNumber() {
        for (int i = 1; i < 1001; i++) {
            int num = i;
            int result = 0;
            if (num <= 9) {
                System.out.println(num);
            } else {
                while (num != 0) {
                    int rem = num % 10;
                    result += Math.pow(rem, 3);
                    num = num / 10;
                }
                if (result == i) {
                    System.out.println(i);
                }
            }
        }

    }
}
