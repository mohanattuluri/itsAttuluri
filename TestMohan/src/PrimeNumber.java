public class PrimeNumber {

	public static void main(String[] args) {

		int n = 7, flag = 0;
		for (int i = 2; i < n/2; i++) {
			if (n % i == 0) {
				flag++;
				break;
			}

		}

		if (flag == 0)
			System.out.println("This is Prime");
		else
			System.out.println("Not prime");

	}
}
