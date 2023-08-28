import java.util.LinkedList;
import java.util.TreeSet;

// from rosetta stone
public class Main {
    static LinkedList<Long> primes = new LinkedList<>();
    public static void main(String[] str) {
        primes.add(2L);
        long next = 3L;
        while(primes.size() != 10001){
            if(isPrime(next))
                primes.add(next);
            next += 2;
        }
        System.out.println(primes.getLast());
    }
    public static boolean isPrime(Long p){
        for(Long l : primes)
            if(p % l == 0)
                return false;
        return true;
    }
}
