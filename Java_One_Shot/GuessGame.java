package Java_One_Shot;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        int randomNumber = (int)Math.random()*100;
        Scanner sc = new Scanner(System.in);
        int userNamber = 0 ; 
        do{
            if(userNamber == randomNumber){
                System.out.println("You Won");
            }
            else if(userNamber > randomNumber){
                System.out.println("Too High");
            }
            else{
                System.out.println("Too Low");

            }
        }while(userNamber != randomNumber);
        sc.close();
        System.out.println(randomNumber);
    }
}
