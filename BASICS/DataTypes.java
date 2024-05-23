public class DataTypes {
	public static void main(String args[])
	{
		// PRIMITIVE DATA TYPES
		char a = 'G';
		int i = 89;
		byte b = 4;
		short s = 56;
		double d = 4.355453532;
		float f = 4.7333434f;
		long l = 12121;

		System.out.println("char: " + a);
		System.out.println("integer: " + i);
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("long: " + l);

		// NON PRIMITIVE DATA TYPES - String, Object, Class, Interface

		// Declare String without using new operator 
		String str = "GeeksforGeeks"; 
		// Declare String using new operator 
		String s1 = new String("GeeksforGeeks");

		System.out.println("String 1: " + str);
		System.out.println("String 2: " + s1);
	}
}
