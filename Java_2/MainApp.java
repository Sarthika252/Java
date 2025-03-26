import math.MathOperations;
import math.convertNumberConverter;
public class MainApp {
public static void main(String[] args) {
int factorialResult = MathOperations.factorial(5);
System.out.println("Factorial of 5: " + factorialResult);
double cubeResult = MathOperations.cube(3.0);
System.out.println("Cube of 3.0: " + cubeResult);
int decimalNumber = 42;
String binaryResult = NumberConverter.toBinary(decimalNumber);
System.out.println("Binary: " + binaryResult);
String octalResult = NumberConverter.to0ctal(decimalNumber);
System.out.println("Octal: " + octalResult);
String hexResult = NumberConverter.toHex(decimalNumber);
System.out.println("Hex: " + hexResult);
String binaryInput = "101010";
int decimalFromBinary = NumberConverter.fromBinary(binaryInput);
System.out.println("Decimal from Binary" + binaryInput + ": " + decimalFromBinary);
}
}