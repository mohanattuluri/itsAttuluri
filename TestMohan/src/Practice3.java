

public class Practice3 {
	
	public static void main(String[] args) {
		
		//PrintMessage();
		//PrintEvenNumbers();
		//DivisbleBy5();
		SumAll();
		
	}
	
	public static void PrintMessage() {
		
		String x = "We are Learning.";
		String y = "Java is Easy.";
		int z = 1000;
		System.out.println("I am Mohan. "+x+" Wonders Happen. "+y+ z+" times.");
	}
	
	public static void PrintEvenNumbers() {
		
		int max = 50;
		System.out.println("Printing Even Numbers between 1 and "+max);
		for(int i=0; i<=max; i++){
			if (i%2==1){
				System.out.println(i);
			}	
		}
			
	}
	
	public static void DivisbleBy5() {
		
		int max = 100;
		System.out.println("Printing all Numbers between 1 and "+max+" which are divisble by 5");
		for(int i=0; i<=max; i++){
			if (i%5==0){
				System.out.println(i + " is divisble by 5");
			}	
		}
			
	}
	
	public static void SumAll() {
		
		int sum = 0;
		int max = 100;
		
		System.out.println("Sum of first "+max+ " numbers is as below");
		
		for(int i=1; i<=max; i++){
			sum = sum+i;
		}
		
		System.out.println(sum);
	}
	

}
