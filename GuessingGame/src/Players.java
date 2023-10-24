import java.util.Scanner;
class Players{
    int guessNum;

    int guessingNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Player, Guess the number:");
        guessNum= in.nextInt();
        return guessNum;
    }

}