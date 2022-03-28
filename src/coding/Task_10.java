package src.coding;

//        Task 10. Write an application that gets one positive number (type int) from the user and calculates a sum of digits of the given number.
//        Hint: to make some operations on every single digit of the number (digit by digit), you can calculate the remainder of dividing the
//        number by 10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next digit).

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber;
        int lastNumber;
        int sum = 0;
        System.out.println("Please input a number: ");

        myNumber = sc.nextInt();

        while (myNumber > 0){
            lastNumber = myNumber % 10;
            sum = sum + lastNumber;
            myNumber = myNumber / 10;
        }
        System.out.println(sum);
    }
}
