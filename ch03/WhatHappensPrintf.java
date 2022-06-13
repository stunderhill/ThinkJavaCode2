
public class WhatHappensPrintf {
/**	
	Exercise 3.1 When you use printf, the Java compiler does not check your
	format string. See what happens if you try to display a value with type int
	using %f. And what happens if you display a double using %d? What if you
	use two format specifiers, but then provide only one value?
**/
	public static void main (String[] arguments) {
		final int x = 10;
		final double y = 3.25;

		//print int with %f
		System.out.printf("Print int with floating point format mask %f", x); 
			// throws java.util.IllegalFormatConversionException
		
		//print double with %d
		System.out.printf("Print double with integer format mask %d", y); 
			// throws java.util.IllegalFormatConversionException
		
		//print with format specifiers but only one argument
		System.out.printf("Print with two format specifiers %d and %f, but with only one argument supplied.", x); 
			// throws java.util.MissingFormatArgumentException
	}
}
