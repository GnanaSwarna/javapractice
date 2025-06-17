import java.util.*;

public class LogicalSetProgram {

    public static boolean isOnlyDigits(String str) {
        return str.matches("\\d+");
    }

    public static void countVowelsConsonants(String str) {
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) >= 0) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static boolean isPalindromeNoString(int n) {
        int original = n, reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return original == reverse;
    }

    public static boolean areAnagrams(String s1, String s2) {
        char[] a = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] b = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void printPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void charFrequency(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static String replaceVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "*");
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Logical Programs - Set 3");
        System.out.println("1. Check if string contains only digits");
        System.out.println("2. Count vowels and consonants");
        System.out.println("3. Check palindrome number (no string)");
        System.out.println("4. Check if two strings are anagrams");
        System.out.println("5. Print all primes in range");
        System.out.println("6. Convert number to binary");
        System.out.println("7. Count words in sentence");
        System.out.println("8. Character frequency in string");
        System.out.println("9. Replace vowels with '*'");
        System.out.println("10. Check if number is power of 2");
        System.out.print("Enter your choice (1–10): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter a string: ");
                String s1 = sc.nextLine();
                System.out.println(isOnlyDigits(s1) ? "Contains only digits" : "Contains other characters");
                break;
            case 2:
                System.out.print("Enter a string: ");
                String s2 = sc.nextLine();
                countVowelsConsonants(s2);
                break;
            case 3:
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                System.out.println(isPalindromeNoString(num) ? "Palindrome" : "Not a palindrome");
                break;
            case 4:
                System.out.print("Enter first string: ");
                String a = sc.nextLine();
                System.out.print("Enter second string: ");
                String b = sc.nextLine();
                System.out.println(areAnagrams(a, b) ? "Anagrams" : "Not Anagrams");
                break;
            case 5:
                System.out.print("Enter start of range: ");
                int start = sc.nextInt();
                System.out.print("Enter end of range: ");
                int end = sc.nextInt();
                printPrimesInRange(start, end);
                break;
            case 6:
                System.out.print("Enter number: ");
                int dec = sc.nextInt();
                System.out.println("Binary: " + toBinary(dec));
                break;
            case 7:
                System.out.print("Enter a sentence: ");
                String sentence = sc.nextLine();
                System.out.println("Word Count: " + countWords(sentence));
                break;
            case 8:
                System.out.print("Enter string: ");
                String text = sc.nextLine();
                charFrequency(text);
                break;
            case 9:
                System.out.print("Enter string: ");
                String input = sc.nextLine();
                System.out.println("Result: " + replaceVowels(input));
                break;
            case 10:
                System.out.print("Enter number: ");
                int check = sc.nextInt();
                System.out.println(isPowerOfTwo(check) ? "Power of 2" : "Not a power of 2");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
