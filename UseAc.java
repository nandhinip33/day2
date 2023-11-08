package day2;

public class UseAc {

	public static void main (String [] args) {
		Ac a1 = new Ac();
		a1.brand = "Samsung";
		a1.colour = "White";
		
		Ac a2 = new Ac();
		a2.brand = "LG";
		a2.colour = "Black";
		
		Ac a3 = new Ac();
		a3.brand = "Bluestar";
		a3.colour = "Grey";
		
		String upcase = a1.brand.toUpperCase();
		String locase = a2.brand.toLowerCase();
		String concat = a1.brand.concat(a2.brand+a3.brand);
		int length = concat.length();
		char[] conchar = concat.toCharArray();
		String concat1 = a1.colour.concat(a2.colour+a3.colour);
		String [] split = concat1.split("Black");
		
		System.out.println(upcase);
		System.out.println(locase);
		System.out.println(concat);
		System.out.println(length);
		System.out.println(conchar);
		System.out.println(concat1);
		System.out.println(split[0]);
		
				
			
	}
}
