
/* Create a console application that asks a user for 10 different fruits.
You are required to use the following concepts:
An array that stores 10 different fruits
2 functions:
1 function to get user input
1 function to output the collection of fruits
Use for loop to prompt the user for the fruits and to output the fruits in the array. */

// Take input from the user
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        String[] fruits = new String[10]; //An Array that will store the different fruits
        getUserInput(fruits); // Get the input for the fruits
        displayFruits(fruits); // Displays the fruits
    }
    private static void getUserInput(String[] fruits) {
        Scanner scanner = new Scanner(System.in); // Scanner Object that takes in input

        System.out.println("Enter 10 different fruits:");

        for (int i = 0; i<10; i++) {
            System.out.print("Enter fruit " + (i + 1) + ": ");
            fruits[i] = scanner.nextLine(); //Accepts input and assign to array string
        }
        scanner.close(); //prevent resource leak
    }
    private static void displayFruits(String[] fruits){
        System.out.println("\nCollection of Fruits:");
        for (int i=0; i<10; i++){
            System.out.println("Fruit " +(i + 1) + ": " + fruits[i]);
        }




    }
}
