import java.util.Scanner;

public class Test {
	static void FooBar() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Give a number ");
		int x = scan.nextInt();

		for (int i=1; i<=x; i++){ 
			if (i%3 == 0 && i%5 == 0){
				System.out.printf("\nFoobar");
	      	}
			else if(i%5 == 0){
				System.out.printf("\nBar");
			}
			else if (i%3 == 0){
				System.out.printf("\nFoo");
			}
			else{
				System.out.printf("\n%d",i);
			}
	}
}
		
	public static void main(String[] args) {
		FooBar();

	}
}

	

