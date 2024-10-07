import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestCommonSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        int[][] dp = new int[first.length() + 1][second.length() + 1];
        int maxLength = 0;
        int endIndex = -1;

        for (int i = 1; i <= first.length(); i++) {
            for (int j = 1; j <= second.length(); j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;  
                    }
                }
            }
        }

        List<Character> result = new ArrayList<>();
        for (int i = endIndex - maxLength + 1; i <= endIndex; i++) {
            result.add(first.charAt(i));
        }

        for (Character character : result) {
            System.out.print(character);
        }
    }
}
