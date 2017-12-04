import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class MagicEightBallTest {
    MagicEightBall magicEightBall;

    @Before
    public void before() {
        magicEightBall = new MagicEightBall();

        magicEightBall.addWord("Hello");
        magicEightBall.addWord("How");
        magicEightBall.addWord("Are");
        magicEightBall.addWord("You");

    }

    @Test
    public void getNumberOfWords() {
        assertEquals(4, magicEightBall.getWordCount());
    }

    @Test
    public void canAddWord() {
        magicEightBall.addWord("Magic");
        assertEquals(5, magicEightBall.getWordCount());

    }

    @Test
    public void returnRandom() {
        System.out.println(magicEightBall.randomAnswer());
        assertNotNull(magicEightBall.getWordCount());
    }

    @Test
    public void canRemoveWordAtIndex() {
        magicEightBall.removeWordAtIndex(0);
        assertEquals(3, magicEightBall.getWordCount());
    }

    @Test
    public void canRemoveWord() {
        magicEightBall.removeWord("Hello");
        assertEquals(3, magicEightBall.getWordCount());
    }

    @Test
    public void canDeleteAll() {
        magicEightBall.deleteAll();
        assertEquals(0, magicEightBall.getWordCount());
    }
}
