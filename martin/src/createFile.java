import java.io.*;
import java.lang.*;
import java.util.*;

public class createFile {
	private Formatter y;
	
	public void openFile(){
		try{
			y = new Formatter("chinese.txt");
		}
		catch(Exception e){
			System.out.println("You have an error");
		}
	}
	
	public void addRecords(){
		y.format("%s%s%s", "22 ", "Martin ", "Orav");
	}
	
	public void closeFile(){
		y.close();
	}
}
