
public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50, flag;
		// int[] a;
		for (int i = 1; i <= n; i++){
			flag=0;
			for (int j = 2; j <= i/2; j++){
				if(i % j == 0){
					flag++;
					break;
				}
			}
			if(flag==0){
				System.out.print(" "+i+", ");
			}
		}
	}
}


