import java.util.Scanner;

class methodsparameters {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		methodsparameters2 methodsparameters2Object = new methodsparameters2();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		methodsparameters2Object.simpleMessage(name);
	}
}