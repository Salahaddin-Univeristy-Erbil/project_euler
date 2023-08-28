import java.util.LinkedList;
import java.math.*;

// from rosetta stone
public class Main {
    public static void main(String[] str) {
        for(long a = 1; a < 1000; a++) {
            for (long b = 1; b < a; b++) {
                long c = 1000 - (a + b);
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    System.out.println(a * b * c);
                    System.out.println("a=" + a + ", b=" + b + ", c=" + c);
                    System.exit(0);
                }
            }
        }

    }

}
