package PracticeFolder.Revise.Loops;

public class SumWithForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int count = 1; count <= 50; count++) {
            sum += count;
        }
        System.out.print("The sum of 1-50 is: " + sum);
    }
}
