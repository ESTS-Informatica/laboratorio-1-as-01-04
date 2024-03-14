public class FullGame {
    private WordGuessingGame wordGame;
    private InputReader reader = new InputReader();


    


    public void play() {
        char leave;
        wordGame = new WordGuessingGame(reader);
        do {
            wordGame.play();
            leave = reader.getChar("Quer continuar? (s/n)");
        }while(leave == 's');
    }
}
