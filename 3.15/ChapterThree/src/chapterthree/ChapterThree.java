/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapterthree;

/**
 *
 * @author chels
 */
import java.util.Scanner;
public class ChapterThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
       // Generate a lottery number
      int lottery = (int)(Math.random() * 1000);
 
       // Prompt the user to enter a guess
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your lottery pick (three digits): ");
     int guess = input.nextInt();

      // Get digits from lottery
      int lotteryDigit1 = lottery % 10;
     int lotteryDigit2 = lottery % 100 /10;
     int lotteryDigit3 = lottery % 10;

      // Get digits from guess
     int guessDigit1 = guess % 10;
     int guessDigit2 = guess % 100/10;
     int guessDigit3 = guess % 10;

     System.out.println("The lottery number is " + lottery);

     // Check the guess
     if (guess == lottery)
        System.out.println("Exact match: you win $10,000");
     else if (((guessDigit1 == lotteryDigit1) && (guessDigit1 == lotteryDigit2) && (guessDigit1 == lotteryDigit3))
             && ((guessDigit2 == lotteryDigit1) && (guessDigit2 == lotteryDigit2) && (guessDigit2 == lotteryDigit3))
             && ((guessDigit3 == lotteryDigit1) && (guessDigit3 == lotteryDigit2) && (guessDigit3 == lotteryDigit3)))
       System.out.println("Match all digits: you win $3,000");
      else if (guessDigit1 == lotteryDigit1
            || guessDigit1 == lotteryDigit2
            || guessDigit1 == lotteryDigit3
            || guessDigit2 == lotteryDigit1
            || guessDigit2 == lotteryDigit2
            || guessDigit2 == lotteryDigit3
            || guessDigit3 == lotteryDigit1
            || guessDigit3 == lotteryDigit2
            || guessDigit3 == lotteryDigit3)
        System.out.println("Match one digit: you win $1,000");
      else
        System.out.println("Sorry, no match");
    }
  }
    
    //this one was tough, I had to dig in my brain to compare the correct pairs of digits.
//first run, the lottery was only two numbers.
//second run, same issue, but reward worked.
//third run, rewards arent working after changing math.random to 1000
//fourth run, rewards arent working correctly, but lottery gen is successful
//rewards are wrong, one number match says you win 3k.

