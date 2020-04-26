package tgt.igniteplus;

import java.util.Scanner;

public class StringIsEmpty {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String s = in.nextLine();
        char[] ArrayOfString = s.toCharArray();
        int length = 0;
        for(char c: ArrayOfString)
            length++;
        if(length == 0){
            System.out.println("The given string is empty");
        }
        else{
            System.out.println("The given string is not empty");
        }
    }
}
