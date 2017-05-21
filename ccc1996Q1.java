/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc1996;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author EulerLoop (AnkitPatel)
 */
public class ccc1996Q1 {
// Problem A: Deficient, Perfect, and Abundant    
    public static void main(String[] args) {
        
        // Initializing all Variables
        int i = 1;
        int k = 1;
        int a = 0;
        int b = 0;
        int c = 1;
        int value = 0;
        List<Integer> integers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numOfIntegers = Integer.parseInt(sc.nextLine());
        
        // Loop in order to add all scanned integers into an ArrayList for Integers
        while (i <= numOfIntegers) {
            int n = Integer.parseInt(sc.nextLine());
            integers.add(n);
            i++;
        }
        
        // Loop in order to determine whetehr an integer is Deficient, Perfect, or Abundant
        // The loop is run equal to the number of integers choosen in the starting
        while (k <= numOfIntegers) {
            int num = integers.get(0+a);
            while (c < num) {
                if ((num % c) == 0) {
                  value = value + c;           
                }
                c++;
            }
            c = 1;
            a++;
            k++;
            
            //Output
            if (value > num) {
                System.out.println(num + " is an abundant number.");
            }
            else if (value < num) {
                System.out.println(num + " is a deficient number.");
            }
            else {
                System.out.println(num + " is a perfect number");
            }
            value = 0;
        }
    }     
}

