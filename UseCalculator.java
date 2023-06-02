package functionalinter;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator ad=(a,b)->a+b;
		Calculator s=(c,d)->c-d;
		Calculator m=(g,n)->g*n;
		System.out.println(ad.maths(5, 5));
		System.out.println(s.maths(10, 5));
		System.out.println(m.maths(5, 5));
		Calculator.printOperation("addition");
		ad.activity();
		
	//	System.out.println(sub.maths(2, 1));
		//Calculator.printOperation("addition");
		//sub.activity();
		
		
		
	}

}
