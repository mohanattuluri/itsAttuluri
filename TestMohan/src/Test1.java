
public class Test1 {

	public static void main(String[] args) {
		
	int[]	a = {1,2,5,6,7,4,9,10,11,13};	
	
	int evencount = 0;
	int oddcount = 0;
	for(int i=0;i<a.length-1; i++){
		
		if (a[i]% 2 ==0)
		{
			System.out.println("This is Even number-->"+a[i]);
			evencount++;
		}
		else
			System.out.println("This is Odd number-->"+a[i]);
			oddcount++;
	}
	System.out.println("Even Number count is "+evencount + " & a" +"Odd Number count is "+ oddcount);
	
	}

}
