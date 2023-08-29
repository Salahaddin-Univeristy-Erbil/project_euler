public class Main {

    public static void main(String[] str) {
        long i = 1;
        long tr = 0;
        do{
            tr += i;
            i++;
        }while(divisors(tr) < 500);
        System.out.println(tr);

    }
    public static int divisors(long n){
        int count = 0;
        long limit = (long) Math.sqrt(n);
        for(long i = 1; i < limit; i++){
            if(n % i == 0){
                count++;
                if(i != n/i)
                    count++;
            }
        }
        return count;
    }
}
