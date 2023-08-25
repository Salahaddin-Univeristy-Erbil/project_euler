public class Main {
    public static void main(String[] args) {
        long count1 = 0;
        long count2 = 0;
        long startTime = System.nanoTime();

        for(int i = 1; i < 1000000; i++){
            if( i % 3 == 0 || i % 5 == 0)
                count1 += i;
        }

        long midTime = System.nanoTime();

        midTime -= startTime;
        startTime = System.nanoTime();
        for(int i = 3; i < 1000000; i+=3){
            count2 += i;
        }
        for(int i = 5; i < 1000000; i+=5){
            if(i % 3 != 0)
                count2 += i;
        }

        long endTime = System.nanoTime();

        // get the difference between the two nano time valuess
        long timeElapsed = endTime - startTime;
        System.out.println(count1);
        System.out.println(count2);

        System.out.println(midTime/    1000000.0);
        System.out.println(timeElapsed/1000000.0);

    }
}