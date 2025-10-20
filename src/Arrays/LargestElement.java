public class LargestElement{
	public static void main(String[] args){

	int[] numbers = {12, 6, 10, 1, 5};
	int result = largestNumber(numbers);
	System.out.println("The largest number is : " + result);

}

	public static int largestNumber(int[] numbers){
	int largeNumber = 0;
	
	for(int count = 0; count < numbers.length; count++){ 
		if(numbers[count] > largeNumber){
			largeNumber = numbers[count];
		}
	}
	return largeNumber;
	}

}