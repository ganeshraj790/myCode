package functionalinter;

public class UseNameLength {
	public static void main(String[] args) {
		
		NameLength g=a->{
			for(int i=0;i<a.length;i++) {
			if(a[i].length()>5) {
				System.out.println(a[i]);
			}
		}
	};
	
	String [] num= {"ganesh","ram","kumar","hariharan"};
	g.checkStringLength(num);
	
	
	}

}
