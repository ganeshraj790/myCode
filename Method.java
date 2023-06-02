package functionalinter;

public class Method {
	public int findMax(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	
	public int findMin(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<=min) {
				min=a[i];
			}
		}
		return min;
	}
	public int findnum(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	return 0;
		
	}
	
	public String maxName(String a[]) {
		int max=a[0].length();
		String temp="";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max) {
				max=a[i].length();
				temp=a[i];
			}
		}
		return temp;
	}
	
	

}
