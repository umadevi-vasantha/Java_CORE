package com.core.string.code;
//Included Pretty Printing and format specifier examples in the code
public class StringPrettyPrintingAndFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Format specifiers
		//%s: String:
		String name = "John";
		String formattedString = String.format("Name: %s", name);
		System.out.printf(formattedString);
		//%d: Decimal integer (int):
		int number = 42;
		System.out.printf("Age: %d", number);
		//%f: Floating-point (float, double):
		double value = 3.14159;
		String formattedFloat = String.format("Value: %f", value);
		System.out.println(formattedFloat);
		//%b: Boolean:
		boolean flag = true;
		String formattedBoolean = String.format("Flag: %b", flag);
		System.out.println(formattedBoolean);
		//%c: Character:
		char grade = 'A';
		String formattedChar = String.format("Grade: %c", grade);
		System.out.println(formattedChar);
		//%n: Platform-specific newline character:
		String message = "Line 1%nLine 2";
		System.out.printf(message);
		//%o: Octal integer:
		int octalNumber = 42;
		String formattedOctal = String.format("Octal Number: %o", octalNumber);
		System.out.println(formattedOctal);
		//%x or %X: Hexadecimal integer (lowercase or uppercase):
		int hexNumber = 255;
		String formattedHexLower = String.format("Hex (lowercase): %x", hexNumber);
		String formattedHexUpper = String.format("Hex (uppercase): %X", hexNumber);
		System.out.println(formattedHexLower);
		System.out.println(formattedHexUpper);
		//%f: Decimal floating-point:
		double floatValue = 123.456789;
		String formattedDecimalFloat = String.format("Value: %f", floatValue);
		System.out.println(formattedDecimalFloat);
		//%e or %E: Scientific notation (lowercase or uppercase):
		double scientificValue = 0.000012345;
		String formattedScientificLower = String.format("Scientific (lowercase): %e", scientificValue);
		String formattedScientificUpper = String.format("Scientific (uppercase): %E", scientificValue);
		System.out.println(formattedScientificLower);
		System.out.println(formattedScientificUpper);
		//%g or %G: General format (decimal or scientific notation, depending on the value):
		double generalValue1 = 123.456;
		double generalValue2 = 0.000012345;
		String formattedGeneral1 = String.format("General 1: %g", generalValue1);
		String formattedGeneral2 = String.format("General 2: %G", generalValue2);
		System.out.println(formattedGeneral1);
		System.out.println(formattedGeneral2);
		//%4d: Minimum width of 4 characters for integers:
		int widthInteger = 42;
		String formattedWidthInteger = String.format("Width: %4d", widthInteger);
		System.out.println(formattedWidthInteger);
		//%.2f: Two decimal places for floating-point numbers:
		double precisionValue = 3.14159;
		String formattedPrecision = String.format("Precision: %.2f", precisionValue);
		System.out.println(formattedPrecision);
		//%-10s: Left-justified string within a 10-character width:
		String leftJustifiedString = "Left";
		String formattedLeftJustified = String.format("Left-justified: %-10s|", leftJustifiedString);
		System.out.println(formattedLeftJustified);
		//%+d: Display the sign for positive and negative numbers:
		int signedNumber = 42;
		int negativeSignedNumber = -15;
		String formattedSignedNumber = String.format("Signed: %+d, Negative: %+d", signedNumber, negativeSignedNumber);
		System.out.println(formattedSignedNumber);
		//%05d: Zero-padding for integers (width of 5):
		int zeroPaddedNumber = 7;
		String formattedZeroPadded = String.format("Zero-padded: %05d", zeroPaddedNumber);
		System.out.println(formattedZeroPadded);



		


	}

}
