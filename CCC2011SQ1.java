/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc2011sq1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author EulerLopp (Ankit Patel)
 */
public class CCC2011SQ1 {

    public static void main(String[] args) {
       List<String> Text = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       int numOfLines = Integer.parseInt(sc.nextLine());
       
       // Checking to make sure that numOfLines is (0 < numOfLines < 10000)
       if (numOfLines == 0 || numOfLines > 10000) {
           System.exit(0);
        }
       
       // Initialzing all variables relating to counting or closing loops
       int LinesOfTextCounter = 0;
       int  i = 0;
       int a = 0;
       int b = 0;
       int amountOfT = 0;
       int amountOfS = 0;
       
       // Gathering all  lines of text
       while (LinesOfTextCounter < numOfLines) {
            String n = sc.nextLine();
            
            // Ensuring that no line has more than 100 characters and has atleast 1 character
            if (n.length() < 1 || n.length() > 100) {
                System.exit(0);
            }
            
            Text.add(n);
            LinesOfTextCounter++;
       }
       
       // Using a while loop to get the amount of tT or sS in each line
       while (i == 0) {
            String lines = Text.get(0+a);
            while (b < lines.length()) {
                char letter = lines.charAt(0 + b);
                if (letter == 't' || letter == 'T') {
                    amountOfT++;
                }
                else if (letter == 's' || letter == 'S') {
                    amountOfS++;
                }
                b++;
            }
            i++;
       }
    
       // Output
       if (amountOfT > amountOfS) {
           System.out.println("English");
       }
       else if (amountOfS >= amountOfT) {
           System.out.println("French");
       }
    }
    
    
    
}
