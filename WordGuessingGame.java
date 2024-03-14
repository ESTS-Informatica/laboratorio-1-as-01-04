public class WordGuessingGame {
    private String hiddenWord;
    private String guessWord;
    private int numberOfTries;
    private InputReader reader;
    private WordGenerator generator;


    public WordGuessingGame(InputReader reader) {
        hiddenWord = generator.generateWord();
        initializaGuessedWord();
        numberOfTries = 0;
        this.reader = reader;
    }


    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public void setGuessWord(String guessWord) {
        this.guessWord = guessWord;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }


    private void showGuessedWord() {
        System.out.println(guessWord);
    }

    public void play() {
        showWelcome();
        do {
            showGuessedWord();
            guess();
        }while (!hiddenWord.equals(guessWord));
        showResult();
        reset();
    }

    private void showWelcome() {
        System.out.println("Bem vindo ao Word Guessing Game!");
    }

    private void guess() {
        char letter = reader.getChar("Digite a letra: ");
        for(int i = 0; i < hiddenWord.length(); i++) {
            if (letter == hiddenWord.charAt(i))
                guessWord.replace(guessWord.charAt(i), letter);
        }
        numberOfTries++;
    }

    private void showResult() {
        System.out.println("Numero de tentativas: " + numberOfTries);
    }

    private void initializaGuessedWord() {
        guessWord = "";
        for(int i = 0; i < hiddenWord.length(); i++) {
            guessWord += "_";
        }
    }

    private void reset() {
        hiddenWord = generator.generateWord();
        initializaGuessedWord();
        numberOfTries = 0;
    }
}
