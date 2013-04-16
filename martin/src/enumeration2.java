import java.util.EnumSet;

class enumeration2 {
	public static void main(String[] args){
		for(enumeration people: enumeration.values()){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
		
		System.out.println("\nAnd now for the range of constants!\n");
		
		for(enumeration people: EnumSet.range(enumeration.renar, enumeration.silvia)){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
	}
}
