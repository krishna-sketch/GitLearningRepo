package loops;
import java.util.Scanner;
public class Forloop {

	public static void main(String[] args) {
//		for (int i=0; i<100; i++)
//			System.out.println("Hello World" +i);
		
//		for(int i=0; i<100; i=i+2)
//			System.out.println("Hello World" +i);
//		int sum=0;
//		int n=5;
//		for(int i=1;i<=n;i++ ) {
//			sum=sum+i;}
//			System.out.println(sum);
//		
		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the table number to be printed");
//		int tableOf= sc.nextInt();
//		
//		for(int i=1;i<=10;i++)
//		{
//			int table=tableOf*i;
//			System.out.println(table);
//			
//			
//			
//		}
		
		System.out.println("Enter the number for which factorial is to be calculated");
		int q = sc.nextInt();
		int p=1;
		
		for(int  i=1;i <= q; i++) 
		{
			 
		  p=p*i;
	
		 }
		
		
		System.out.println("factorial is" + p);
		
		
		
		
		
	}

}
