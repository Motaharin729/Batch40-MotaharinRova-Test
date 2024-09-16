
public class Parent extends Grandparent {
	
	
	
	public  void call(){
		
		System.out.println("my grand parent name is "+ getName());
		System.out.println("Parent class is Single level inheritance");
	}
	public static void main(String[] args) {
		
		Parent obj = new Parent();
		obj.setName("Adam");
		obj.call();
	}

}
