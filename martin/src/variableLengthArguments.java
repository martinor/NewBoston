class variableLengthArguments {
	public static void main(String[] args){
		System.out.println(average(43,56,77,85,2,4,31,233));
	}
	
	public static int average(int...numbers){
		int total = 0;
		for(int x:numbers){
			total+=x;
		}
		
		return total / numbers.length;
	}
}
