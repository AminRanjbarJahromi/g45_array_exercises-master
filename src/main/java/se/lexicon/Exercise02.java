package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {

  /**
   * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
   * If the element does not exist your method should return -1 as value.
   * Expected output: Index position of number 5 is: 2.
   */

 /* public static void ex2() {
    int numbers[] = {1, 5, 6, 7, 9, 11};
    Scanner sc = new Scanner(System.in);
    System.out.println("search number in the array : ");
    int input = sc.nextInt();
    int index = Arrays.binarySearch(numbers,input);
    System.out.println(index);
    if( index<0) {
      System.out.println("Data not found");

    }else{
      System.out.println("index position of number " + input + " is " + index);
    }
  }
  */


  public static void ex2() {
    System.out.println("index position of number " + indexOf(2) + " is : " +  indexOf(2));
  }

  private static int indexOf(int input) {
    int[] numbers = { 1,3,5,7,8,2,11};
    for( int i = 0 ; i< numbers.length ; i++){
      if(numbers[i] == input) {
        return i ;
      }
    }
    return -1;
  }


}


