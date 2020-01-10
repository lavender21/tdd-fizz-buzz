package tdd.practice;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class FizzBuzzGameTest {

    @Test
    public void should_return_1_when_input_1() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertThat(fizzBuzzGame.handleNumber(1)).isEqualTo("1");
    }
}
