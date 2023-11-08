package day2;

public class Stringmethod {
	public static void main (String [] args) {
		String name = "Nandhini";
		String names = "Periyasamy";
		String nam = "Computerised World";
		
		String name1 = name.toUpperCase();
		String name2 = name.toLowerCase();
		int name3 = name.length();
		boolean name4 = name.contains("u");
		String name5 = name.concat(names);
		boolean name6 = name.startsWith("N");
		boolean name7 = name.endsWith("d");
		boolean name8 = name.equals(names);
		boolean name9 = name.equalsIgnoreCase(names);
		int name10 = name.indexOf("n");
		char name11 = name.charAt(1);
		//char name11 = name.charAt(name.length()-1);
		char[] name12 = name.toCharArray();
		String name13 = name.substring(0,1);
		String [] name14 = name.split("n");
		String [] name15 = nam.split(" ");
		
		
		
		System.out.println("1.Uppercase:" +name1);
		System.out.println("2.Lowercase:" +name2);
		System.out.println("3.Length:" +name3);
		System.out.println("4.Contains:" +name4);
		System.out.println("5.Concat:" +name5);
		System.out.println("6.StartsWith:" +name6);
		System.out.println("7.EndWith:" +name7);
		System.out.println("8.Equals:" +name8);
		System.out.println("9.EqualsIgnorecase:" +name9);
		System.out.println("10.IndexOf:" +name10);
		System.out.println("11.CharAt:" +name11);
		System.out.println("12.ToCharArray:"+name12 [4]);
		System.out.println("13.SubString:" +name13);
		System.out.println("14.Split:" +name14[0]);
		System.out.println("14.Split:" +name14[1]);
		System.out.println("14.Split:" +name14[2]);
		System.out.println(name15[0]);
		System.out.println(name15[1]);
		
		
		
		
	}

}

/*String a = "Nandhu";
String b = "nandhu";
boolean c = a.equalsIgnoreCase(b);







*/