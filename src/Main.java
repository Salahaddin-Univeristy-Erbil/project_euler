import java.util.TreeSet;

// from rosetta stone
public class Main {


    public static void main(String[] str) {
        long n = 600851475143L;

        TreeSet<Long> factors = new TreeSet<>();

        Long current_test = 2L;
        while (n != 1L) {
            while (n % current_test == 0L) {
                factors.add(current_test);
                n = n / current_test;
            }
            current_test++;

        }
        System.out.println(factors.last());
    }


}
