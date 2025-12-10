package PracticeFolder.Revise.methodsFunctions;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        int numberToCheck = 20;
        boolean result = primeNumber(numberToCheck);

        if(result){
            System.out.println(numberToCheck + " is a prime number");
        }
        else{
            System.out.println(numberToCheck + " is not a prime number");
        }
    }

    public static boolean primeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int count = 2; count < number; count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }
}
