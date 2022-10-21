package se.lexicon;

import java.util.Arrays;

public class Exercise03 {

  /**
   * 3. Write a program which will sort string array.
   * Expected output:
   *                String array: [Paris, London, New York, Stockholm]
   *                Sort string array: [London, New York, Paris, Stockholm]
   */
  public static void ex3() {
      String[] names = {"Paris", "London", "New York", "Stockholm"};
      //Arrays.sort(names);
      Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
      for (String name : names) {
        System.out.print(name + "\t");
      }
    }
  }


