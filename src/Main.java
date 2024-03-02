import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String string = "welcome";
        String pattern = "come";
        String indexes = Arrays.toString(findPattern(string, pattern));

        System.out.println(indexes);

    }

    static int[] findPattern(String string, String pattern) {
        int n = string.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && pattern.charAt(j) == string.charAt(i + j)) {
                j++;
            }
            if (j == m) {
                return new int[]{i, i + j};
            }
        }
        return new int[]{};
    }
}