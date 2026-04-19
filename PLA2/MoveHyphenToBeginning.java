package PLA2;

public class moveHyphenToBeginning {
    public static String moveHyphen(String s) {
        int hyphencount = 0;
        String word = "";
        
        for(char i : s.toCharArray()){
            if(i == '-'){
                hyphencount++;
            }else{
                word += i;
            }
        }

        String hyphen = "";
        for(int i=0; i<hyphencount; i++){
            hyphen += '-';
        }

        return hyphen + word; 
    }
    public static void main(String[] args) {
        String s = "ab-cd-eg-";
        System.out.println(moveHyphen(s));
    }
}


// TC = n  SC = n