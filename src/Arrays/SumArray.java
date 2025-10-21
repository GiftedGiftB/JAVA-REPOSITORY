package Arrays;

public class SumArray {

    public int[] sumAllArrayElement(int[] numbers) {
        int[] sumArray = new int[1];
        sumArray[0]= numbers[0];
        for (int count = 1; count < numbers.length; count++) {
            sumArray[0]+= numbers[count];
        }
        return sumArray;
    }
}
