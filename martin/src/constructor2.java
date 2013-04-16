
public class constructor2 {
	private String girlName;
	
	public constructor2(String name){		//Konstruktori nimi peab olema sama mis klassil
		girlName = name;
	}
	
	public void setName(String name){
		girlName = name;
	}
	
	public String getName(){
		return girlName;		
	}
	
	public void saying(){
		System.out.printf("Your first gf was %s\n", getName());
	}
}
