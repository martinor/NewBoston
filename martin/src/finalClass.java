class finalClass {
	public static void main(String[] args){
		finalClass2 fcObject = new finalClass2(10);
		
		for(int i = 0; i < 5; i++){
			fcObject.add();
			System.out.printf("%s", fcObject);
		}
	}
}
