package myjava1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;

        int reversed = 0, remainder;

        // reverse the number
        while (num > 0) {
            remainder = num % 10;
            reversed = (reversed * 10) + remainder;
            num /= 10;
        }

        // check palindrome
        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
