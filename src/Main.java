public class Main {
    public static void main(String[] args) {
        long firstNumber = 1;
        long secondNumber = 1;
        long newNumber;
        long evenTotal = 0;
        while(secondNumber < 4_000_000){

            if(secondNumber % 2 == 0)
                evenTotal += secondNumber;

            newNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = newNumber;
        }
        System.out.println(evenTotal);

    }
}