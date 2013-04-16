public class finalClass2 {
	private int sum;
	private final int NUMBER;		//A good way to know which ones are constants is to put the constants in CAPS
	
	public finalClass2(int x){
		NUMBER = x;
	}
	
	public void add(){
		sum+=NUMBER;
	}
	
	public String toString(){
		return String.format("Sum = %d\n", sum);
	}
}
