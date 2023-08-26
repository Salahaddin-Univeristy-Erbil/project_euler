import java.util.TreeSet;

// from rosetta stone
public class Main {
    public static void main(String[] str) {
        int pal = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= i; j--) {
                int t = i * j;
                if (isPalindrome("" + t)) {
                    if (pal < t)
                        pal = t;
                }
            }
        }
        System.out.println(pal);
    }

    public static boolean isPalindrome(String p) {
        int length = p.length() - 1;
        int loop = length / 2;
        for (int i = 0; i <= loop; i++) {
            if (p.charAt(i) != p.charAt(length - i))
                return false;
        }
        return true;
    }
}
