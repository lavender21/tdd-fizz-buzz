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

    @Test
    public void should_return_FizzBuzz_when_input_15() {
        assertFizzBuzzRule(15, "FizzBuzz");
    }

    @Test
    public void should_return_FizzWhizz_when_input_21() {
        assertFizzBuzzRule(21, "FizzWhizz");
    }

    @Test
    public void should_return_Fizz_when_input_35() {
        assertFizzBuzzRule(35, "BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_input_105() {
        assertFizzBuzzRule(105, "FizzBuzzWhizz");
    }

    @Test
    public void should_return_Fizz_when_input_13() {
        assertFizzBuzzRule(13, "Fizz");
    }

    @Test
    public void should_return_Fizz_when_input_30() {
        assertFizzBuzzRule(30, "Fizz");
    }

    @Test
    public void should_return_Buzz_when_input_135() {
        assertFizzBuzzRule(135, "Buzz");
    }

    @Test
    public void should_return_153_when_input_153() {
        assertFizzBuzzRule(153, "153");
    }

    @Test
    public void should_return_Fizz_when_input_37() {
        assertFizzBuzzRule(37, "Fizz");
    }

    @Test
    public void should_return_Fizz_when_input_370() {
        assertFizzBuzzRule(370, "Fizz");
    }

    @Test
    public void should_return_Fizz_when_input_637() {
        assertFizzBuzzRule(637, "Fizz");
    }

    @Test
    public void should_return_Fizz_when_input_75() {
        assertFizzBuzzRule(75, "Fizz");
    }

    private void assertFizzBuzzRule(int num, String expected) {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(num);
        fizzBuzzGame.parse();
        assertThat(fizzBuzzGame.getOutput()).isEqualTo(expected);
    }

}
