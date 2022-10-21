package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise06 {

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */
  public static void ex6() {
    double [] numbers = {43, 5, 23, 17, 2};
    double total = 0;
    double [] newArrayNumbers = Arrays.copyOf(numbers,numbers.length+1);
    Scanner sc = new Scanner(System.in);
    System.out.println("Import new number : ");
    double input = sc.nextInt();
    newArrayNumbers[newArrayNumbers.length-1] = input;
    for(int i = 0 ; i< numbers.length ; i++){
      total = total + numbers[i];
    }
    double average = total / numbers.length;
    System.out.println(" Average is : " + average);



  }

}
