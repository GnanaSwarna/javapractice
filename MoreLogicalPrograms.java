import java.util.Scanner;

public class MoreLogicalPrograms {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isArmstrongGeneral(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static boolean isStrong(int n) {
        int original = n, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == original;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static boolean isHarshad(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return n % sum == 0;
    }

    public static void numberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static boolean isPalindromeNumber(int n) {
        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("More Logical Programs in Java:");
        System.out.println("1. Even or Odd");
        System.out.println("2. Armstrong Number (any digits)");
        System.out.println("3. Multiplication Table");
        System.out.println("4. Perfect Number");
        System.out.println("5. Strong Number");
        System.out.println("6. Harshad Number");
        System.out.println("7. Number Pattern");
        System.out.println("8. Star Pattern");
        System.out.println("9. Palindrome Number");
        System.out.print("Choose (1-9): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter number: ");
                int evenCheck = sc.nextInt();
                System.out.println(isEven(evenCheck) ? "Even" : "Odd");
                break;
            case 2:
                System.out.print("Enter number: ");
                int arm = sc.nextInt();
                System.out.println(isArmstrongGeneral(arm) ? "Armstrong" : "Not Armstrong");
                break;
            case 3:
                System.out.print("Enter number: ");
                int table = sc.nextInt();
                multiplicationTable(table);
                break;
            case 4:
                System.out.print("Enter number: ");
                int perf = sc.nextInt();
                System.out.println(isPerfect(perf) ? "Perfect Number" : "Not Perfect");
                break;
            case 5:
                System.out.print("Enter number: ");
                int strong = sc.nextInt();
                System.out.println(isStrong(strong) ? "Strong Number" : "Not Strong");
                break;
            case 6:
                System.out.print("Enter number: ");
                int harshad = sc.nextInt();
                System.out.println(isHarshad(harshad) ? "Harshad Number" : "Not Harshad");
                break;
            case 7:
                System.out.print("Enter number of rows: ");
                int numRows = sc.nextInt();
                numberPattern(numRows);
                break;
            case 8:
                System.out.print("Enter number of rows: ");
                int starRows = sc.nextInt();
                starPattern(starRows);
                break;
            case 9:
                System.out.print("Enter number: ");
                int palNum = sc.nextInt();
                System.out.println(isPalindromeNumber(palNum) ? "Palindrome" : "Not Palindrome");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
