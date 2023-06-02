package functionalinter;

public class UseMaximumAge {
	public static void main(String[] args) {
		MaximumAge de=(a,b,c)->{
			if(a>b&&a>c) {
				return a;
			}
			else if(b>a&&b>c) {
				return b;
			}
			else {
				return c;
			}
		};
	
		System.out.println(de.checkMaximumAge(30, 20, 40));
	}

}
