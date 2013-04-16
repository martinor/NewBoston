class multipleConstructorsMain {
	public static void main(String[] args){
		multipleConstructors mcObject = new multipleConstructors();
		multipleConstructors mcObject2 = new multipleConstructors(5);
		multipleConstructors mcObject3 = new multipleConstructors(5,13);
		multipleConstructors mcObject4 = new multipleConstructors(5,13,43);
		
		System.out.printf("%s\n", mcObject.toMilitary());
		System.out.printf("%s\n", mcObject2.toMilitary());
		System.out.printf("%s\n", mcObject3.toMilitary());
		System.out.printf("%s\n", mcObject4.toMilitary());
	}
}
