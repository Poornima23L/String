package tgt.igniteplus;

import java.util.Scanner;

public class StringCompare {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String s1 = in.nextLine();
        System.out.println("Enter second string");
        String s2 = in.nextLine();

        if(s1.equals(s2)){      //compares two strings
            System.out.println("Both strings are equal ");
        }
        else{
            System.out.println("Both strings are not equal ");
        }

        if(s1.equalsIgnoreCase(s2)){      //compares two strings and can ignore case
            System.out.println("Both strings are equal ");
        }
        else{
            System.out.println("Both strings are not equal ");
        }

        int n = s1.compareTo(s2); //COMPARES TWO STRINGS AND RETURNS :0 IF EQUAL, POSITIVE NUM IF STR1>STR2 , NEGATIVE NUM IF STR1<STR2
        if(n==0){
            System.out.println("Both strings are equal ");
        }
        else{
            System.out.println("Both strings are not equal ");
        }

    }
}
