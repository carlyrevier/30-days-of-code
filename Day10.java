package day10;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp=0;
        int max=0;
                      
        while (n>0){
            int remainder = n%2;
            if (remainder==1){
                temp++;
                if (temp>max){
                    max = temp;
                }
            } else {
                temp = 0;
            }  
            n=n/2;
        }
        System.out.print(max);
    }
}
