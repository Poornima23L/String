package tgt.igniteplus;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String s = in.nextLine();
        char[] ArrayOfString = s.toCharArray();
        int length = 0;
        for(char c: ArrayOfString)
            length++;
        System.out.println("Length of given string is " +length);
        System.out.println("Length of given string using builtin function is " +s.length());

    }

}
