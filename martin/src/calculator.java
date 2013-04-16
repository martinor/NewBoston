import java.util.Scanner;

public class calculator {
	public static void main(String args[]){
		Scanner martin = new Scanner(System.in);
		double fnum, snum, answer;
		
		System.out.println("Enter first number: ");
		fnum = martin.nextDouble();
		
		System.out.println("Enter second number: ");
		snum = martin.nextDouble();
		
		answer = fnum + snum;
		System.out.println(answer);
	}
}