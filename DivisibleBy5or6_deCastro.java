//Melissa deCastro
//March 3, 2017
//MIS 120 - Ch 5 Homework

public class DivisibleBy5or6_deCastro {

  public static void main(String[] args) {
    System.out.println("\tNumbers Divisble by 5 or 6");
    System.out.println("Divisble by 5 \t\t Divisble by 6");
    // Display the number title
    System.out.print("    ");
    for (int j = 1; j <= 4; j++)
      System.out.print("   " + j);

    System.out.println("\n-----------------------------------------");

    // Print table body
    for (int i = 1; i <= 4; i++) {
      System.out.print(i + " | ");
      for (int j = 1; j <= 4; j++) {
        // Display the product and align properly
        System.out.printf("%4d", i * j);
      }
      System.out.println();
    }
  }
}