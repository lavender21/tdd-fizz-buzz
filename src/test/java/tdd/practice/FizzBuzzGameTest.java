package tdd.practice;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class FizzBuzzGameTest {

    @Test
    public void should_return_1_when_input_1() {
        assertFizzBuzzRule(1, "1");
    }

    @Test
    public void should_return_Fizz_when_input_3() {
        assertFizzBuzzRule(3, "Fizz");
    }

    @Test
    public void should_return_Buzz_when_input_5() {
        assertFizzBuzzRule(5, "Buzz");
    }

    @Test
    public void should_return_Whizz_when_input_7() {
        assertFizzBuzzRule(7, "Whizz");
    }

    private void assertFizzBuzzRule(int num, String expected) {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertThat(fizzBuzzGame.handleNumber(num)).isEqualTo(expected);
    }

}
