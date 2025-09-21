package myjava1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;

        int result = 0, remainder;
        int digits = String.valueOf(num).length(); // number of digits

        // check Armstrong
        while (num > 0) {
            remainder = num % 10;
            result += Math.pow(remainder, digits);
            num /= 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
