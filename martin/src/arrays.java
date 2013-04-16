class arrays {
	public static void main(String[] args){
		int martin[] = new int[10];
		int martin2[] = {2,4,6,2,6,8,3,1,8,2,6};
		
		martin[0] = 86;
		martin[1] = 535;
		martin[9] = 52;
		
		System.out.println(martin[1]);
		System.out.println(martin2[3]);
		
		System.out.println("Index\tValue");
		int martin3[] = {32,45,123,53,75};
		
		for(int counter = 0; counter < martin3.length; counter++){
			System.out.println(counter + "\t" + martin3[counter]);
		}
		
		int martin4[] = {15,94,23,64,32};
		int sum = 0;
		
		for(int counter = 0; counter < martin4.length; counter++){
			sum += martin4[counter];
		}
		
		System.out.println("The sum of these numbers is " +sum);
		
		int martin5[] = {3,4,5,6,7};
		int total = 0;
		
		for(int x: martin5){
			total+=x;
		}
		
		System.out.println(total);
		
		//multidimentional arrays
		
		int firstarray[][] = {{1,2,3,4},{5,6,7,8}};
		int secondarray[][] = {{30, 31, 32, 33},{43},{4,5,6}};
		
		System.out.println("This is the first array");
		display(firstarray);
		
		System.out.println("This is the second array");
		display(secondarray);
	}
	
	public static void display(int x[][]){
		for(int row = 0; row < x.length; row++){
			for(int column = 0; column < x[row].length; column++){
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
