public class LaunchGame {
    public static void main(String[] args){
        Umpire ump = new Umpire();
        ump.collectNumFromGuesser();
        ump.collectNumFromPlayers();
        ump.compare();


    }
}