package PracticeFolder.chapter6;
import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationPractice {
    private static final SecureRandom = new SecureRandom();
    private static final Scanner = new Scanner(System.in);

    public static void main(String[] args){
            System.out.print("Welcome to the Multiplication Practice Program");
            askQuestion();
    }

    private static void askQuestion() {
        Scanner random = null;
        int num1 = random.nextInt(9) + 1;
        int num2 = random.nextInt(9) + 1;

        int result = num1 * num2;
        int userInput;

    System.out.print("what is %d times %d? ", num1,num2);
    userInput = Scanner.nextInt();

    if(userInput == result){
        System.out.println("Correct.");
        askQuestion();
    }
    else{
        System.out.println("Incorrect.");
    }
    }

}

