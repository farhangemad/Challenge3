package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String palindrome = almostPalindrome("1234312");
        Integer ways = waysToClimb(4);

        System.out.println(palindrome);
        System.out.println(ways);

    }

    public static String almostPalindrome(String palin){
        char[] drome = palin.toCharArray();
        int hopefullyOne = 0;

        if(drome.length % 2 == 0){
            for(int i = 0; i < (drome.length / 2) - 1; i++){
                if(drome[i] != drome[drome.length -  i - 1]){
                    hopefullyOne = hopefullyOne + 1;
                }
            }
        } else {
            int test  = (drome.length / 2) - 1;
            for(int i = 0; i <= test; i++){
                if(drome[i] != drome[drome.length -  i - 1]){
                    hopefullyOne = hopefullyOne + 1;

                }
            }
        }

        if(hopefullyOne == 1){
            return "true";
        } else {
            return "false";
        }
    }


    public static Integer waysToClimb(int stairs){
        List all = new ArrayList<>();
        all.add(1);
        all.add(1);

        for(int i = 2; i <= stairs; i++){
            all.add((Integer)all.get(i-1) + (Integer)all.get(i-2));
        }

        return (Integer) all.get(stairs);
    }


}
