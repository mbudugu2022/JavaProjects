import java.util.Scanner;
class Guesser {
    int guessNum;

    int guessingNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the Number:");
        guessNum = in.nextInt();
        return guessNum;
    }
}
