//For a description of the task, see https://www.hackerrank.com/challenges/30-dictionaries-and-maps

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Map<String,Integer> friendPhone = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            friendPhone.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(friendPhone.containsKey(s)){
                System.out.println(s + "=" + friendPhone.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
