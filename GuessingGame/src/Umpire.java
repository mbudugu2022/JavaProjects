 class Umpire{

    int numFromGuesser=0;
    int numFromPlayer1=0;
    int numFromPlayer2=0;
    int numFromPlayer3=0;

    void collectNumFromGuesser(){
        Guesser guess = new Guesser();
        numFromGuesser= guess.guessingNumber();
    }

    void collectNumFromPlayers(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }

    void compare(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("Player1,2,3 won the game");
            }else if(numFromGuesser == numFromPlayer2){
                System.out.println("Player1,2 won the game");
            }
            else if(numFromGuesser == numFromPlayer3){
                System.out.println("Player1,3 won the game");
            }
            else{
                System.out.println("Player1 won the game");
            }

        } else if (numFromGuesser== numFromPlayer2) {
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Game tied between player2 and player3");
            }else{
                System.out.println("Player2 won the game");
            }

        }else if(numFromGuesser== numFromPlayer3 ){
            System.out.println("Player3 won the game");
        }else{
            System.out.println("Game Lost! Try again");
        }

    }

}