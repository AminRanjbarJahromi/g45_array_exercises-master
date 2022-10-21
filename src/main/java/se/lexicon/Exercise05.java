package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {
    String[][] region = new String[2][2];
    region[0][0] = "France";
    region[0][1] = "Paris";

    region[1][0] = "Sweden";
    region[1][1] = "Stockholm";
    for (int i = 0; i < region.length; i++) {
      for (int j = 0; j < region[i].length; j++) {
        System.out.print(region[i][j] + "\t");
      }
      System.out.println("\n");

    }

  }

}
