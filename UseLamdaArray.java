package functionalinter;

public class UseLamdaArray {
	public static void main(String[] args) {
		LamdaArray l=a->{
			for(int i=0;i<a.length;i++) {
							if(a[i]>0) {
								System.out.println(a[i]);
							}
		}
		};
		int [] num= {-10,30,20,40,-55};
		l.findPositiveNum(num);
		}
		
	}


