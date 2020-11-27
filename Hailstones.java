/*
 I found the end result of Douglas Hofstadter’s Pulitzer-prize-winning book Gödel, Escher, Bach on the internet.
 The program made me curious of how I would implement that from scratch which,
 I tried but I'm facing issues: endless loops and the program is not altering the initial number.
 */

import java.util.Scanner; //Scanner so the user can put his/her own value.

public class Hailstones {

    public static void main(String args[]) {
        // The code block below requests a number from the user.
        // Since we're using integers, I used scanner.nextInt() and an integer number variable
        // to store the user's value.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            System.out.println("Welcome to Hailstones.");
            System.out.println("Please enter a whole number: " + number);

     // steps is a variable that will store the number of lines it took to get to 1.
    int steps = 0;

    // I thought a while loop would be appropriate here so that the program keeps on going until
    // it stops when it finds 1.
    while(number != 1) {
        if (number % 2 == 0)    { // An even number has a remainder of 0.
            System.out.println(number + " is even, so I take half: " + number/2); // The program would initially begin
         // with the user's even value and then altered to a new halved value that it would use again in the next loop.
        } else { // The user inputted an odd number
            number = (number*3) + (number + 1);
            System.out.println(number + " is odd, so I make 3n+1: " + number); // The program would initially begin
            // with the user's odd value and then altered to a new value that it would use again in the next loop.

        }
        steps++; // After every line the counter would increase until it stops when the number reaches 1.
        System.out.println("It took " + steps + " steps to reach 1.");
        }
    }    
    }
       