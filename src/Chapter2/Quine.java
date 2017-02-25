package Chapter2;

public class Quine {

	public static void main(String[] args) 
	{
		String out = "package Chapter2;"
				+ "public class Quine {"
				+ "public static void main(String[] args)"
				+ "{"
				+ "String out = %c%s%1$c " 
				+ "System.out.printf(out,34,out); "
				+ "}"
				+ "}";
		System.out.printf(out,34,out);	
	}

}
