package tgt.igniteplus;

import java.util.Scanner;

public class CharacterRemoval {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String s = in.nextLine();
        System.out.println("Enter character to ne removed");
        String ch = in.nextLine();
        s = s.replace(ch,"");
        s = s.replace(ch.toUpperCase(),"");
        System.out.println("The string after removing " +ch+ "in string is\n" +s);

    }
}
