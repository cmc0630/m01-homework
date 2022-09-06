/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chaptertwo;

/**
 *
 * @author chels
 */
import java.util.Scanner;
public class ChapterTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a value in feet: ");
        double foot = keyboard.nextDouble();
        double meter = (foot * 0.305);
        System.out.println(foot + " Feet is " + meter + " Meters.");
    }
    // original run, formula was wrong. said 5.5 feet is 18.0327 meters.
    //changed to multiply by .305 and it worked.
}
