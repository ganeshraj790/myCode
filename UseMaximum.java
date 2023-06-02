package functionalinter;

public class UseMaximum {
	public static void main(String[] args) {
		Method m=new Method();
		FindMaximum mu= m:: findMax ;
		FindMaximum fu=m:: findMin;
		FindMaximum nn=m :: findnum;
	
		
		int []a= {19,34,22,40,55,30};
	
		System.out.println(mu.findMax(a));
		System.out.println(fu.findMax(a));
		nn.findMax(a);
	
	}

}
