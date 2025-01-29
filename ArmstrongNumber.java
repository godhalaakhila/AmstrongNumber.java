 public class ArmstrongNumber{

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = 0;

        // Calculate the number of digits in the number
        while (num > 0) {
            num /= 10;
            digits++;
        }

        num = originalNum;

        // Calculate the sum of each digit raised to the power of number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    // Function to print all Armstrong numbers in a given range
    public static void printArmstrongNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Specifying the start and end of the range directly
        int start = 1;
        int end = 1000;

        // Print Armstrong numbers in the given range
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        printArmstrongNumbers(start, end);
    }
}
 
    

