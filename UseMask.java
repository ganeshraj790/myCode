package lms;

import java.util.HashMap;

public class UseMask {
	public static void main(String[] args) {
		String[]t=args[0].split(",");
		String a=t[0];
		String b=t[1];
		String c=t[2];
		String d=t[3];
		String e=t[4];
		String[]n=args[1].split(",");
		Mask m1=new Mask(a,Integer.parseInt(n[0]));
		Mask m2=new Mask(b,Integer.parseInt(n[1]));
		Mask m3=new Mask(c,Integer.parseInt(n[2]));
		Mask m4=new Mask(d,Integer.parseInt(n[3]));
		Mask m5=new Mask(e,Integer.parseInt(n[4]));
		HashMap<Mask,String>masks=new HashMap<>();
		masks.put(m1, a);
		masks.put(m2, b);
		masks.put(m3, c);
		masks.put(m4, d);
		masks.put(m5, e);
		for(Mask m:masks.keySet()) {
			System.out.println(m);
			System.out.println(masks.get(e));
		}
		
		
		
		
	}

}
