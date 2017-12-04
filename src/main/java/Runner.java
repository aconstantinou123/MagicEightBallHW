import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        MagicEightBall magicEightBall = new MagicEightBall();
        magicEightBall.addWord("Hello");
        magicEightBall.addWord("How");
        magicEightBall.addWord("Are");
        magicEightBall.addWord("You");

        System.out.println(magicEightBall.randomAnswer());
    }
}