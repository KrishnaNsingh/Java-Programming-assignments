package PLA;

import java.util.*;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        sc.close();
        boolean[] bool =  new boolean[num];
        for(int i=0; i<num; i++){
            bool[i] = true;
        }
        for(int i=2; i<Math.sqrt(num); i++){
            if(bool[i] == true){
                for(int j=i*i; j<num; j += i){
                    bool[j] = false;
                }
            }
        }
        for(int i=2; i<num; i++){
            if(bool[i] == true){
                System.out.println(i);
            }
        }
    }
}
