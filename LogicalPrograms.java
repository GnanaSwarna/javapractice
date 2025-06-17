import java.util.Scanner;

public class LogicalPrograms {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }

    public static boolean isArmstrong(int n) {
        int original = n, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == original;
    }

    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Logical Programs in Java:");
        System.out.println("1. Prime Number");
        System.out.println("2. Fibonacci Series");
        System.out.println("3. Factorial");
        System.out.println("4. Palindrome String");
        System.out.println("5. Armstrong Number");
        System.out.println("6. Largest of Three Numbers");
        System.out.println("7. Count Digits");
        System.out.println("8. Sum of Digits");
        System.out.println("9. Reverse Number");
        System.out.println("10. Leap Year Check");
        System.out.print("Choose (1-10): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter number: ");
                int n1 = sc.nextInt();
                System.out.println(isPrime(n1) ? "Prime" : "Not Prime");
                break;
            case 2:
                System.out.print("Enter number of terms: ");
                int n2 = sc.nextInt();
                fibonacci(n2);
                break;
            case 3:
                System.out.print("Enter number: ");
                int n3 = sc.nextInt();
                System.out.println("Factorial: " + factorial(n3));
                break;
            case 4:
                System.out.print("Enter string: ");
                sc.nextLine(); // consume newline
                String str = sc.nextLine();
                System.out.println(isPalindrome(str) ? "Palindrome" : "Not Palindrome");
                break;
            case 5:
                System.out.print("Enter 3-digit number: ");
                int n5 = sc.nextInt();
                System.out.println(isArmstrong(n5) ? "Armstrong Number" : "Not Armstrong");
                break;
            case 6:
                System.out.print("Enter three numbers: ");
                int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                System.out.println("Largest: " + largest(a, b, c));
                break;
            case 7:
                System.out.print("Enter number: ");
                int n7 = sc.nextInt();
                System.out.println("Digit Count: " + countDigits(n7));
                break;
            case 8:
                System.out.print("Enter number: ");
                int n8 = sc.nextInt();
                System.out.println("Sum of Digits: " + sumOfDigits(n8));
                break;
            case 9:
                System.out.print("Enter number: ");
                int n9 = sc.nextInt();
                System.out.println("Reversed: " + reverseNumber(n9));
                break;
            case 10:
                System.out.print("Enter year: ");
                int year = sc.nextInt();
                System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
