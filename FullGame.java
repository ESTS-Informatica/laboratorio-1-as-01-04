public class FullGame {
    private static WordGuessingGame wordGame;

    private static InputReader reader = new InputReader();


    public static void main(String[] args) {
        play();
    }


    public static void play() {
        char leave;
        wordGame = new WordGuessingGame();
        do {
            wordGame.play();
            leave = reader.getChar("Quer continuar? (s/n) - ");
        }while(leave == 's');
    }
}
