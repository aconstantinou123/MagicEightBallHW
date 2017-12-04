import java.util.ArrayList;
import java.util.Collections;

public class MagicEightBall {
    private ArrayList<String> answers;

    public MagicEightBall() {
        this.answers = new ArrayList<>();
    }

    public int getWordCount() {
        return this.answers.size();
    }

    public void addWord(String answer) {
        this.answers.add(answer);
    }

    public String randomAnswer() {
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public void removeWordAtIndex(int index) {
        this.answers.remove(index);
    }

    public void removeWord(String word) {
        this.answers.remove(word);
    }

    public void deleteAll() {
        this.answers.clear();
    }


}
