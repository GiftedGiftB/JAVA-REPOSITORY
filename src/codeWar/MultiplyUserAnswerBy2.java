package codeWar;

import java.util.Scanner;

public class MultiplyUserAnswerBy2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int UserNumber = input.nextInt();

        int total = UserNumber * 2;
        System.out.println("The answer is: " + total);
    }
}
