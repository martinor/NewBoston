import java.util.Scanner;

public class increment {
	public static void main(String args[]){
		Scanner martin = new Scanner(System.in);
		
		int tuna = 5;
		int bass = 18;
		
		++tuna;
		System.out.println(tuna);
		System.out.println(++tuna);
		
		System.out.println(tuna++);
		System.out.println(tuna);
		
		tuna *= 4;
		System.out.println(tuna);
	}
}