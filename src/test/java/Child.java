
public class Child extends  Parent {
	
	public int a =3;
	public void asset() {
		System.out.println("my number "+a);
		System.out.println("Child class is Multi level inheritance");
		
	}
	public static void main(String[] args) {
		
		Child obj1 = new Child();
		obj1.setName("Adam");
		obj1.call();
		obj1.asset();
	
		
	}

}
