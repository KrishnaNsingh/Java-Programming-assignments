package PLA;

public class Binary_Palindrom {
    public static void main(String[] args) {
        int x = 9;
        String s = Integer.toBinaryString(x);
        String s1 = "";
        for(int i=s.length()-1; i>=0; i--){
            s1 += s.charAt(i);
        }
        if(s1 == s){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
