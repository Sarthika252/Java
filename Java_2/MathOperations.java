package math;
public class MathOperations {
public static int factorial(int n) {
return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
}
public static double cube(double num) {
return num *num * num;
}
}
package math.convert;
public class NumberConverter {
public static String toBinary(int decimal) {
return Integer.toBinaryString(decimal);
}
public static String toOctal(int decimal) {
return Integer.toOctalString(decimal);
}
public static String toHex(int decimal) {
return Integer.toHexString(decimal);
}
public static int fromBinary(String binary) {
return Integer. parseInt(binary, 2);
}
public static int fromOctal(String octal) {
return Integer parseInt(octal, 8);
}
public static int fromHex(String hex) {
return Integer.parseInt(hex, 16);
}
}
