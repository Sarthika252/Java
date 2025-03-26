import java.util.*;
    public class TPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i+1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}