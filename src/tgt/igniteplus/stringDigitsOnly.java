package tgt.igniteplus;

public class stringDigitsOnly {
    public static void testDigit(String s){
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                System.out.println("The given string does not contains digits only ");
                return;
            }
        }
        System.out.println("The given string  contains digits only ");
    }
    public static void main(String[] args){
        String s1 ="56usn";
        String s2 ="1234";
        System.out.println("The given string is "+s1);
        testDigit(s1);
        System.out.println("The given string is "+s2);
        testDigit(s2);

    }
}
