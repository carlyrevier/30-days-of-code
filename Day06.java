//For a description of the task, see https://www.hackerrank.com/challenges/30-review-loop

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numCases = scanner.nextInt();
        int index = 0;
                
        while(index < numCases){
            String even_odd = scanner.next();
            char[] myCharArray = even_odd.toCharArray();
            for(int j = 0; j < even_odd.length(); j=j+2){
                System.out.print(myCharArray[j]);
            }
            System.out.print(" ");
            for(int k = 1; k < even_odd.length(); k=k+2){
                System.out.print(myCharArray[k]);
            }
            System.out.println();
            index++;
        }
    }
}
