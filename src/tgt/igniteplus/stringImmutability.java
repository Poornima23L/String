package tgt.igniteplus;

class StringImmutability {
    public static void refCheck(String str1,String str2){
        if(str1 == str2){
            System.out.println("Both are pointing to the same reference");
        }
        else{
            System.out.println("Both are pointing to the different reference");
        }
    }
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = "Java";
        System.out.println("before modification in s2");
        refCheck(s1,s2);
        s2 += "ava";
        System.out.println("after modification in s2");
        refCheck(s1,s2);
    }
}
