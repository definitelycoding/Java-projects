/*
 I found the end result of Douglas Hofstadter’s Pulitzer-prize-winning book Gödel, Escher, Bach on the internet.
 The program made me curious of how I would implement that from scratch which,
 I tried but I'm facing issues: endless loops and the program is not altering the initial number.
 */

import java.util.Scanner; //Scanner so the user can put his/her own value.

public class Hailstones {

    public static void main(String args[]) {
        // The code block below requests a number from the user.
        // Since we're using integers, I used scanner.nextInt() and an integer number variable to store the user's value.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            System.out.println("Welcome to Hailstones.");
            System.out.println("The number you entered is: " + number);

     // steps is a variable that will store the number of lines it took to get to 1.
    int steps = 0;

    // A while loop would keep the program going until it reaches 1 where it stops.
    while(number != 1) {
        if (number % 2 == 0)    { // An even number has a remainder of 0.
            number/= 2;
            // User enters a value which can be even or odd.
            // If even, a new halved value is obtained which it would use again in the loop.
            System.out.println(number + " is even, so I take half. " + "\t");
        } else { // The user inputted an odd number
            number = (number*3) + 1;
            // If odd, a new value is obtained by multiply it by 3 then adding 1 which it would use again in the loop.
            System.out.println(number + " is odd, so I make 3n+1. " + "\t");

        }
        steps++; // After every line the counter would increase until it stops when the number reaches 1.
        }
    System.out.println("It took " + steps + " steps to reach 1.");    
   }    
}
       