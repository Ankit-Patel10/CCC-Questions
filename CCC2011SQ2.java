/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc2011sq2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ankit
 */
public class CCC2011SQ2 {

    public static void main(String[] args) {
       List<String> Responses = new ArrayList<>();
       List<String> Answers = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       int numOfQuestions = Integer.parseInt(sc.nextLine());
       int correctAnswers = 0;
       
       // Checking to make sure that numOfLines is (0 < numOfLines < 10000)
       if (numOfQuestions == 0 || numOfQuestions > 10000) {
           System.exit(0);
        }
       
       int x = 0;
       
       
       // Gathering student responses
       while (x < numOfQuestions) {
           String response = sc.nextLine();
           Responses.add(response);
           x++;
       }
       
       
       // Gathering correct Answers
       x = 0;
       while (x < numOfQuestions) {
           String answer = sc.nextLine();
           Answers.add(answer);
           x++;
       }
       
      // Loop used to determine the # of right answers
       int i = 0;
        while (i < Responses.size()) {
            String response = Responses.get(0 + i);
            String answer = Answers.get(0 + i);
            if (response.equals(answer)) {
                    correctAnswers++;
            }
            i++;
        }
     
    
        
     
        // Output
        System.out.println(correctAnswers);
    }
}
    

