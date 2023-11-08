package day2;

public class Stringbuffbuild {
	public static void main (String [] args) {
		String s = "Nandhini";
		       s = "Ramya";
		
		StringBuffer s1 = new StringBuffer("Nandini");
		       s1.append("Ramya");
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("Nandini");
	       s2.append("Ramya");
	System.out.println(s2);
		
		
	}

}
