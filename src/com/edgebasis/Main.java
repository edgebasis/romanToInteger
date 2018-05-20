package com.edgebasis;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String s ="IX";
        Boolean valid = true;
        int number=0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

                map.put('I', 1);
                map.put('V', 5);
                map.put('X', 10);
                map.put('L' ,50);
                map.put('C', 100);
                map.put('D', 500);
                map.put('M', 1000);


        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                valid = false;
                System.out.println("invalid" + s.charAt(i));
                break;
            } else{
                number += map.get(s.charAt(i));
                if(i!=0 && (s.charAt(i) == 'V' || s.charAt(i) == 'X') && s.charAt(i-1) == 'I') number -=2;
                if(i!= 0 && (s.charAt(i) == 'L' || s.charAt(i) == 'C') && s.charAt(i-1) == 'X') number -=20;
                if(i!=0 && (s.charAt(i) == 'D' || s.charAt(i) == 'M') && s.charAt(i-1) == 'C')  number -=200;            }

        }
        if(valid) System.out.println(number);
    }

}
