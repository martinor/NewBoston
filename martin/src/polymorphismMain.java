class polymorphismMain {
	public static void main(String[] args){
		polymorphism3 martin[] = new polymorphism3[2];
		martin[0] = new polymorphism2();
		martin[1] = new polymorphism();
		
		for(int x = 0; x < 2; ++x){
			martin[x].eat();
		}
		
		System.out.println();
		
		polymorphism4 martin2 = new polymorphism4();
//		polymorphism3 fo = new polymorphism3();
		polymorphism3 po = new polymorphism2();
		
//		martin2.digest(fo);
		martin2.digest(po);
	}
}
