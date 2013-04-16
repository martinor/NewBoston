public class mainToString2 {
	private String name;
	private toStringClass birthday;
	
	public mainToString2(String theName, toStringClass theDate){
		name = theName;
		birthday = theDate;
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
