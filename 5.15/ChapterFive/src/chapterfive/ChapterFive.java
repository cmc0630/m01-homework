/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapterfive;

/**
 *
 * @author chels
 */
public class ChapterFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
       System.out.println("         ASCII Table");
 
     

    
  
     int count = 0;
     for(int c = 32; c < 123; c++){
         System.out.print(c+ ":" + " " + (char)c + "  ");
         count++;
         if (count % 10 == 0)
             System.out.println();
     }
     
  }
}
//first run:Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '%'
//changed to a simpler code, no issues.