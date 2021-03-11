package loops;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number  upto fibonacci series to be printed");
		int x= sc.nextInt();
		int p=0;
		int q=1;
		System.out.print(p+ " ");
		System.out.print(q);
		for (int i=0; i<=x;i++) {
			
			int c =p+q;
			System.out.print(c);
			p=q;
			q=c;
			
			 
			// System.out.println(p);
			  
			

			
			
			
		}

	}

}
