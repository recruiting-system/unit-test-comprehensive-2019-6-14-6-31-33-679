package tw.views;

import tw.core.model.GuessResult;

import java.util.List;

/**
 * Created by jxzhong on 2017/5/19.
 */
public class GameView {
    public void showGuessResult(GuessResult guessResult) {
        System.out.println("Guess Result: " + guessResult.getResult());
    }

    public void showGameStatus(String status) {
        System.out.println("Game Status: " + status);
    }

    public void showGuessHistory(List<GuessResult> guessResults) {
        System.out.println("Guess History:");
        guessResults.forEach(guessResult ->
                System.out.println(String.format("[Guess Numbers: %1$s, Guess Result: %2$s]",
                        guessResult.getInputAnswer().toString(),
                        guessResult.getResult())));
    }

    public void showBegin() {
        System.out.println("------Guess Number Game, You have 6 chances to guess!  ------");
    }
}
