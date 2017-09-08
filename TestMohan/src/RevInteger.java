

public class RevInteger {

	public static void main(String[] args) {
		
		ReverseInt();

	}
	
	public static void ReverseInt() {
		
		int ar[] = {1,2,3,4,5,6};
		
		int max=ar.length;
		for(int i = 0; i < max; i++) {
			System.out.println(ar[max-1-i]);
		}
	}
	
}
