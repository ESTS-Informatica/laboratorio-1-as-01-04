import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGenerator {
    private ArrayList<String> words = new ArrayList<String>();


    private void fillArrayList() {
        words.addAll(
                List.of("boolean", "break", "byte", "case",
                        "char", "class", "const", "continue", "do",
                        "double", "else", "enum", "for", "if", "import",
                        "int"));
    }

    public String generateWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }

    public void addWord(String word) {
        words.add(word);
    }
}
