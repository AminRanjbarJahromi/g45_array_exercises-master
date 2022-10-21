package se.lexicon;

import java.util.Arrays;

public class Exercise04 {

  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   *                Elements from first array: 1 15 20
   *                Elements from second array: 1 15 20
   */
  public static void ex4() {
    int[] numbers = {1,15,20};
    int[] realCopy = Arrays.copyOf(numbers,numbers.length);
    for (int myNumber : realCopy){
      System.out.print(myNumber + ",\t");
    }

  }

}
