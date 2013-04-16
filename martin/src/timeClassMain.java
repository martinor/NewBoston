class timeClassMain {
	public static void main(String[] args){
		timeClass timeClassObject = new timeClass();
		System.out.println(timeClassObject.toMilitary());
		System.out.println(timeClassObject.toString());
		
		timeClassObject.setTime(13, 27, 6);
		System.out.println(timeClassObject.toMilitary());
		System.out.println(timeClassObject.toString());
	}
}
