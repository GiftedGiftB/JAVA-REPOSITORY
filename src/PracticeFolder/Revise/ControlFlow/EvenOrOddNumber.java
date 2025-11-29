package PracticeFolder.Revise.ControlFlow;
import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNumber = input.nextInt();

        if(userNumber % 2 == 0){
            System.out.print("It is a Even number");
        }
        else{
            System.out.print("It is a odd number");
        }
    }
}