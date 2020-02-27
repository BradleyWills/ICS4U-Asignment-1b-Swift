// java.util.Scanner found at https://www.programiz.com/java-programming/basic-input-output
import java.util.Scanner;

/**
* The StringTime program rearranges and outputs a string depending on the inputted string.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-02-26 
*/

public class StringStuff {
  // Create variables 
  static int count;
  static double lastNumber;
  static double currentNumber;
  
  /**
  * Rearranges and outputs the rewritten string.
  */
  
  public static void main(String[] args) {
    // Create scanner also found at https://www.programiz.com/java-programming/basic-input-output
    Scanner userInput = new Scanner(System.in);
    // Ask for input
    System.out.println("Input the string.");
    try { 
      count = 0;
      String inputedText = userInput.nextLine();
      // Found at https://www.java67.com/2012/12/how-to-remove-all-white-space-from-String-beginning-end-between.html
      // Removes spaces
      inputedText = inputedText.replaceAll("\\s", "");
      String lastLetter = "";
      String currentLetter = String.valueOf(inputedText.charAt(count));
      String rewrittenString = "";
      // Repeats for each letter
      while (count < inputedText.length()) {
        currentLetter = String.valueOf(inputedText.charAt(count));
        count += 1;
        try {
          lastNumber = Double.parseDouble(lastLetter);
          for (int i = 0; i < lastNumber; i++) {
            // Adds current letter to the end of the rewritten string
            rewrittenString += currentLetter;
          }
          lastLetter = currentLetter;
        } catch (Exception e) {
          try {
            // Checks if current letter is a number
            currentNumber = Double.parseDouble(currentLetter);
            lastLetter = currentLetter;
          } catch (Exception q) {
            rewrittenString += currentLetter;
          }
        }
      }
      // Outputs the rewritten string
      System.out.println("The rewritten string is " + rewrittenString);
    } catch (Exception e) {
      // Informs user their input is invalid
      System.out.println("Invalid Input");
    }
  }
}