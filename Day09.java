package day09;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int Factorial(int n){
        if(n<=1){
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print(Factorial(x));
    }
}