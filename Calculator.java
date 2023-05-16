// This program calculates the power of a number and prints the result.
// It takes input from the user for the number and the power.

import java.util.Scanner;

class Calculator {
  // This method calculates the power of a number and throws an exception
  // if the inputs are invalid.
  public int power(int number, int power) throws Exception {
    if (number < 0 || power < 0) {
      throw new Exception("The inputs should be non-negative.");
    }
    return (int) Math.pow(number, power);
  }
}

class Solution {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user.
    Scanner scanner = new Scanner(System.in);

    // Ask the user how many times they want to calculate the power.
    // Ask the user how many times they want to calculate the power.
System.out.print("How many times do you want to calculate the power? ");
int times = scanner.nextInt();

// Loop through each calculation.
for (int index = 1; index <= times; index++) {
  // Ask the user for the number and power inputs.
  System.out.print("\nEnter the number: ");
  int number = scanner.nextInt();
  System.out.print("Enter the power: ");
  int power = scanner.nextInt();

  // Create a new Calculator object to perform the calculation.
  Calculator calculator = new Calculator();

  try {
    // Calculate the power and print the result.
    int result = calculator.power(number, power);
    System.out.println("Result: " + result);
  } catch (Exception e) {
    // If an exception is thrown, print the error message.
    System.out.println("Error: " + e.getMessage());
  }
}

// Close the scanner object.
scanner.close();
}
}
