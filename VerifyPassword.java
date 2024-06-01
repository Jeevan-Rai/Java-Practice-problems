import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerifyPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt();
            scanner.nextLine();
            String input = scanner.nextLine().trim();
            if (!isValid(n, input)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        scanner.close();

    }
    
    public static boolean isValid(int n, String input) {
        List<Character> digits = new ArrayList<>();
        List<Character> alphabets = new ArrayList<>();

        boolean gotChar = false;

        for (char character : input.toCharArray()) {
            if (Character.isDigit(character)) {
                if (gotChar) {
                    return false;
                } else {
                    digits.add(character);
                }
            } else if (Character.isLowerCase(character)) {
                gotChar = true;
                alphabets.add(character);
            }
            if (!isSorted(alphabets) || !isSorted(digits)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(List<Character> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
