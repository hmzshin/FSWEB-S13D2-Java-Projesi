public class Main {
    public static void main(String[] args) {


        System.out.println("is -1221 Palindrome: " + isPalindrome(-1221));
        System.out.println("is 707 Palindrome: " + isPalindrome(707));
        System.out.println("is 11212 Palindrome: " + isPalindrome(11212));


        System.out.println("is 5 PerfectNumber: " + isPerfectNumber(5));
        System.out.println("is 28 PerfectNumber: " + isPerfectNumber(28));
        System.out.println("is 6 PerfectNumber: " + isPerfectNumber(6));
        System.out.println("is -1 PerfectNumber: " + isPerfectNumber(-1));

        System.out.println("123 to Words: " + numberToWords(123));
        System.out.println("1010 to Words: " + numberToWords(1010));
        System.out.println("-12 to Words: " + numberToWords(-12));
    }


    public static boolean isPalindrome(int value) {
        int originalValue = value;
        int reversedValue = 0;
        while (value != 0) {
            reversedValue = reversedValue * 10 + value % 10;
            value = value / 10;
        }
        return originalValue == reversedValue;

    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            System.out.println("parametre 0'dan küçük olamaz");
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }


    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String numberToString = String.valueOf(number);
        int len = numberToString.length();
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char digit = numberToString.charAt(i);

            switch (digit) {
                case '0':
                    string.append("Zero ");
                    break;
                case '1':
                    string.append("One ");
                    break;
                case '2':
                    string.append("Two ");
                    break;
                case '3':
                    string.append("Three ");
                    break;
                case '4':
                    string.append("Four ");
                    break;
                case '5':
                    string.append("Five ");
                    break;
                case '6':
                    string.append("Six ");
                    break;
                case '7':
                    string.append("Seven ");
                    break;
                case '8':
                    string.append("Eight ");
                    break;
                case '9':
                    string.append("Nine ");
                    break;
                default:
                    System.out.println("Number out of range");
            }
        }

        return string.toString().trim();
    }
}