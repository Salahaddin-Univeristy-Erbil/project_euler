import java.util.LinkedList;

public class Main {
    public static LinkedList<Long> primes = new LinkedList<>();
    public static void main(String[] str) {

        primes.add(2L);
        long next = 3L;
        while(next < 2_000_000){
            if(isPrime(next)) {
                primes.add(next);
            }
            next += 2;
        }
        long sum = 0;
        for(long i: primes)
            sum += i;
        System.out.println(sum);
    }
    public static boolean isPrime(Long p){
        for(Long l : primes)
            if(p % l == 0)
                return false;
        return true;
    }

}
