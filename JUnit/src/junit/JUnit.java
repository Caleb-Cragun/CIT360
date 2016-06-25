/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author Caleb Cragun
 */
public class JUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prints a message to the user about the function of this class
        System.out.println("Hello, and thank you for using this program.");
        System.out.println("The class that this is running from contains");
        System.out.println("additional functions that are run by the JUnit");
        System.out.println("test. Please run that file to see the test results.");
    }
    
    // Method to test with the JUnit tests. Looks through an array of integers 
    // for the greatest value, and then returns that value.
    public static int findMax(int arr[]){
        // Sets max equal to the first number in the array
        int max = arr[0];
        // Reads through the array
        for (int i = 0; i < arr.length; i++){
            // If the value set to max is less than a value in the array, then
            // the value of max is set to that value
            if (max < arr[i]){
                max = arr[i];
            }
        }
        // Max value is then returned
        return max;
    }
    
    // Method to test for JUnit. Adds to numbers together, then returns the total
    public static int sumValues(int a, int b){
        // Returns the sum of a + b
        return a + b;
    }
    
    // Method to test for JUnit. Checks to see if text entered is a palindrome
    public static String palindromeCheck(String text){
        String reverse = "";
        // Removes all of the spaces from text passed in
        text = text.replaceAll("\\s+", "");
        // Gets the length of the word
        int length = text.length();
        // Reads the characters of the input text in reverse and assigns them to
        // the reverse string
        for (int i = length -1; i >= 0; i--){
            reverse = reverse + text.charAt(i);
        }
        // Checks if the text and reverse values are the same returns a message 
        // if they are or aren't
        if (text.equals(reverse)){
            return "Palindrome";
        } else {
            return "Not a palindrome";
        }
    }
}
