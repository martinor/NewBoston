public enum enumeration {
	martin("nice", "22"),
	renar("cool", "21"),
	mati("troll", "17"),
	netti("ilus", "18"),
	silvia("crush", "17"),
	aveli("heasai", "26");
	
	private final String desc;
	private final String year;
	
	enumeration(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}
}