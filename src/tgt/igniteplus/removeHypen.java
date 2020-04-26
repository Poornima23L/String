package tgt.igniteplus;

import java.util.Scanner;

public class removeHypen {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String s1 = in.nextLine();
        char[] ArrayOfString = s1.toCharArray();
        char[] result = new char[ArrayOfString.length];
        int j=0;
        for(int i=0; i<s1.length();i++){
            if (ArrayOfString[i]=='-' && Character.isDigit(ArrayOfString[i-1]) && Character.isDigit(ArrayOfString[i+1])) {
                 continue;
            }
            else{
                result[j++]= ArrayOfString[i];
            }
        }
        System.out.println(result);
    }
}
