public class holdObjectList {
	private holdObjectA[] thelist = new holdObjectA[5];
	private int i = 0;
	
	public void add(holdObjectA a){
		if(i < thelist.length){
			thelist[i] = a;
			System.out.println("holdObject added at index space " + i);
			i++;
		}
	}
}
