
class static1 {
	public static void main(String[] args){
		static2 member1 = new static2("Megan", "Fox");
		static2 member2 = new static2("Natalie", "Portman");
		static2 member3 = new static2("Taylor", "Swift");
		
		System.out.println();
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		
		System.out.println();
		System.out.println(static2.getMembers());
	}
}
