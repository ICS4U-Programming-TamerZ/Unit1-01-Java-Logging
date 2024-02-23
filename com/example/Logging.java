package com.example;

/**
 * This program calculates how many Logs a truck can hold.
 *
 * @author Tamer
 * @version 1.0
 * @since 2024-02-22
 */
import java.util.Scanner;

// Class
public final class Logging {

  /** This is a private constructor used to prevent instantiation. */
  private Logging() {
    throw new UnsupportedOperationException("Cannot be instantiated.");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    // Declaring Volume Radius Pi Decimal shift and fraction variables.
    final float MAX_TRUCK_MASS = 1100f;
    final float MASS_PER_METER = 20f;
    float metersPerLog;
    float massPerLog;
    float numLogFloat;
    int numLog;

    Scanner sc = new Scanner(System.in);

    // Try Catch.
    try {
      // Output to Console.
      System.out.println("This program will help calculate how many logs you can fit based on their respective lengths.");
      System.out.print("Please Input the length of logs 0.25, 0.5, or 1: ");

      // Casts Radius to double.
      metersPerLog = sc.nextFloat();
      // Checks if value is 0.25, 0.5, 1
      if (metersPerLog == 0.25f || metersPerLog == 0.5f || metersPerLog == 1f) {
          // Calculations
          massPerLog = metersPerLog * MASS_PER_METER;
          numLogFloat = (MAX_TRUCK_MASS / massPerLog);
          // Converts Float to Int
          numLog = (int) (numLogFloat);
          // Displays Number of Logs the truck can hold
          System.out.println("You can fit " + numLog + " Logs");
      }
      else {
        // Other Value other than 0.25, 0.5, 1
        System.out.println("Has to 0.25m, 0,5m, or 1m");
      }
      
    } catch (Exception e) {
      // Output any error message.
      System.out.println("Error " + e.getMessage());
    }
    sc.close();
  }
}
