package PracticeFolder.Revise.Loops;

public class SumWithWhileLoop {
    public static void main(String[] args) {

        int number = 1;
        int sum = 0;

        while (number <= 50) {

            sum += number;
            number++;
        }
        System.out.print("The sum of 1-50 is: " + sum + ",");
    }
}
