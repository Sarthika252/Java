import math_package.Statistics;
import math_package1.Converter;

public class ApplicationProgram{
    public static void main(String[] args)
{
 System.out.println("Factorial of 5 :"+ Statistics.factorial(5));
 System.out.println("Cube of 3 :"+ Statistics.cube(3));
int decimal=10;
 System.out.println("Decimal to binary :"+ Converter.decimalToBinary(decimal));
 System.out.println("Decimal to Octal :"+ Converter.decimalToOctal(decimal));
 System.out.println("Decimal to hex :"+ Converter.decimalToHex(decimal));
String binary="1010";
System.out.println("Binary to decimal :"+ Converter.binaryToDecimal(binary));
String octal="12";
System.out.println("Octal to decimal :"+ Converter.octalToDecimal(octal));
String hex="a";
System.out.println("Hex to decimal :"+ Converter.hexToDecimal(hex));
}
}