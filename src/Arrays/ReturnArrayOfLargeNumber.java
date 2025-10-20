import java.util.Arrays;
public class ReturnArrayOfLargeNumber{
	public static void main(String[] args){
	
	int[] numbers = {23, 2, 4, 20, 12};
	int[] result = largestNumber(numbers);
	System.out.println("The largest number is: " + Arrays.toString(result));

}

	public static int[] largestNumber(int[] numbers){
	int[] theLargeNumber = {0};

	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] > theLargeNumber[0]){
			theLargeNumber[0] = numbers[count];
		}
	}
	return theLargeNumber;

	}
}