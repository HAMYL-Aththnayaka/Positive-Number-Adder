import java.util.Scanner;
public class summation{
	public static void main(String args[]){
		
		int n,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive Number :");
		n = sc.nextINT();
		while(n >= 0){
				sum+=n;
					System.out.println("Enter a positive Number :");
					n= sc.nextInt();
					
					}
					System.out.println("The Summation of positive numbers Are: "+sum);
	}
}