package se.lexicon;

import java.util.Arrays;

public class Exercise08 {

  /**
   * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
   * Expected output:
   * Array: 20 20 40 20 30 40 50 60 50
   * Array without duplicate values: 20 40 30 50 60
   */
  public static void ex8() {
    int[] arr = {20, 20, 40, 20, 30, 40, 50, 60, 50};
    int[] distinct = removeDuplicates(arr);
    System.out.println(Arrays.toString(distinct));
  }

    public static int[] removeDuplicates ( int[] arr){
      Arrays.sort(arr);
      int k = 0;
      for (int i = 0; i < arr.length; i++) {
        if (i == 0 || arr[i] != arr[i - 1]) {
          arr[k++] = arr[i];
        }
      }
      return Arrays.copyOf(arr, k) ;

    }

}