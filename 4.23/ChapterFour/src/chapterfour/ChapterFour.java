/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapterfour;

/**
 *
 * @author chels
 */
import java.util.Scanner;

public class ChapterFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, please enter employee's name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        System.out.println("Please enter number of hours worked: ");
        double hours = input.nextDouble();
        
        System.out.println("Please enter current pay rate: ");
        double rate = input.nextDouble();
        
        System.out.println("Enter federal tax withholding rate: ");
        double fed = input.nextDouble();
        
        System.out.println("Enter state tax withholding rate: ");
        double state = input.nextDouble();
        
        
        double gross = (hours * rate);
        
        double fedFinal = (gross * fed);
        
        double stateFinal = (gross * state);
        
        double deduction = (fedFinal + stateFinal);
        
        double net = (gross - deduction);
        
        
        System.out.println("Employee name: " + name + "\n" +
        "Hours Worked: " + hours + "\n" + "Deductions " + "\n" +
                "Pay Rate: " + rate + "\n" + "Gross pay " + gross + "\n" +
                "Federal Withholding: "+ "(" + fed + " %"+")" +  "$" + fedFinal + "\n" +
                "State Witholding: " + "( " + state + "%" + ")" + "$" + stateFinal + "\n" +
        "Total Deduction: " + "$" + deduction + "\n" + "Net Pay: " + "$" + net);
        
        
        
    }
    
}
