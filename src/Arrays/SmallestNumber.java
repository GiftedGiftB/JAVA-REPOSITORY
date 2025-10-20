package Arrays;

public class SmallestNumber {
    public int[] smallestNumberInArray(int[] array) {
        int[] smallNumber = new int[1];
        smallNumber[0] = array[0];
        for (int count = 0; count < array.length; count++){
            if(array[count] < smallNumber[0]){
                smallNumber[0] = array[count];
            }
        }
        return smallNumber;
    }
}
