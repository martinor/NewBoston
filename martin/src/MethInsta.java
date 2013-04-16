import java.util.Scanner;

public class MethInsta {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		MethInsta2 MethInsta2Object = new MethInsta2();
		System.out.println("Enter name of 1st gf here: ");
		String temp = input.nextLine();
		MethInsta2Object.setName(temp);
		MethInsta2Object.saying();
	}
}
