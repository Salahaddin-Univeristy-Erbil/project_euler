import java.util.TreeSet;

// from rosetta stone
public class Main {
    public static void main(String[] str) {
        int n = 2;
        while (true) {
            if(isDivisible(n)){
                System.out.println(n);
                break;
            }
            n+=2;
        }
    }
//232792560
    public static boolean isDivisible(int n) {
        for (int i = 2; i <= 20; i++) {
            if (n % i != 0)
                return false;
        }
        return true;
    }
}
