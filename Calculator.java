package functionalinter;
@FunctionalInterface
public interface Calculator {
	
	
	public  int maths(int a,int b);
	
	
	public static void printOperation(String a) {
		System.out.println(a);
	}
	
	
	public default void activity() {
		
		System.out.println("operation between a and b");
	}
		
	

}
