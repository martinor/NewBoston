class arraysInMeth {
	public static void main(String[] args){
		int martin[] = {3,4,5,6,7};
		change(martin);
		
		for(int y: martin){
			System.out.println(y);
		}
	}
	
	public static void change(int x[]){
		for(int counter = 0; counter < x.length; counter++){
			x[counter]+=5;
		}
	}

}
