
public class Main {
    public static void main(String[] args) {
        long length = 20L;

        System.out.println(combinators(length));
        //System.out.println(pathFinding(length, length));

    }
    public static long pathFinding(int x, int y){
        if(x == 0 && y == 0){
            return 1L;
        }
        if(x < 0  || y < 0 )
            return 0L;
        return pathFinding(x - 1, y) + pathFinding(x, y - 1) ;
    }
    public static long combinators(long n){
        long result = 1L;
        for(long i = 1L; i <= n; i++){
            result *= (n + i)/i;
        }
        return result;
    }
}