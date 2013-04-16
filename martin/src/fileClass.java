import java.io.File;
import java.util.*;

class fileClass {
	public static void main(String[] args){
		File x = new File("C:\\Martini Asjad\\Informaatika\\Eclipse Projects\\martin.txt");
		
		if(x.exists()){
			System.out.println(x.getName() + " exist!");
		} else {
			System.out.println("This thing doesn't exist");
		}
		
		System.out.println();
		
//		final Formatter y;
//		
//		try{
//			y = new Formatter("fred.txt");
//			System.out.println("You created a file");
//		}
//		catch(Exception e){
//			System.out.println("You got an error");
//		}
		
//		createFile g = new createFile();
//		g.openFile();
//		g.addRecords();
//		g.closeFile();
	
		readFile r = new readFile();
		r.openFile();
		r.readfile();
		r.closeFile();
	}
}
