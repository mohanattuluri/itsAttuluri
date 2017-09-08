


public class PyramidTest {
	
	public static void main(String[] args) {
		//NumberPyramid();
		Pyramid();
		Pyramid1();
		Pyramid2();
	}
	
	public static void NumberPyramid() {
		
		
		for(int i=1; i<5; i++){
			
			for(int j=0; j<5-i; j++){
				System.out.print("");
			}
			for(int k=0; k<=i; k++){
				System.out.println("* ");
			}
			System.out.println();
		}
	}
	
	public static void Pyramid() {
		for(int i=0; i < 5; i++){
			for(int j=0; j <= 5; j++){
				if(j<=i) {
					System.out.print(" "+i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void Pyramid1() {
		for(int i=1; i <= 5; i++){
			for(int j=1; j <= i; j++){
				System.out.print(" "+j);
				
			}
			System.out.println();
		}
	}

	public static void Pyramid2() {
		for(int i=1; i <= 20; i++){
			for(int j=1; j <=20-i; j++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
