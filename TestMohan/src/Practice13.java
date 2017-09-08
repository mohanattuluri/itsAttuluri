

public class Practice13 {

	public static void main(String[] args) {

		FindLargestSmallestNumber();

	}
	
	public static void FindLargestSmallestNumber() {
		
		int numbers[] = new int[]{72,29,32,19,27,38,26,56,46,65,98,78,89};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i = 1; i <numbers.length; i++){
			if(numbers[i] > largest){
				largest = numbers[i];
			}
			else if(numbers[i] < smallest){
				smallest = numbers[i];
			}
		}
		System.out.println("Largest number in the array is "+largest);
		System.out.println("Smallest number in the array is "+smallest);
	}

}
