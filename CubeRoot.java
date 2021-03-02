//@author Subham
/* here i have mentioned that how to print cube root of any number by using Math class*/
import java.util.Scanner;
public class CubeRoot{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		double cbrt=Math.cbrt(n);
		System.out.println("cube root of " +n+ " is " +cbrt);
	}
}