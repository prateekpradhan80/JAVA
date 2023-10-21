import java.util.*;
public class RomanToInteger {

    public static int romanToInteger(String romanNumeral) {
        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = getRomanValue(currentChar);

            if (i < romanNumeral.length() - 1) {
                int nextValue = getRomanValue(romanNumeral.charAt(i + 1));

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    private static int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int integerValue = romanToInteger(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equal to integer: " + integerValue);
    }
}
