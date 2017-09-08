

public class Practice10 {

	public static void main(String[] args) {
		
		int i = 2;
		while (makedecision(i)){
			
			i = i*i;
			System.out.println(i);
		}

	}
	
	public static boolean makedecision(int i){
		if(i%3 != 0){
			return true;
		}
			else {
				return false;
			}
	}
}
