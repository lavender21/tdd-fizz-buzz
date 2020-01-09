package tdd.practice;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {
    private void assertFizzBuzz(String input, String expect) {
        FizzBuzz fizzBuzz = new FizzBuzz(input);
        assertThat(fizzBuzz.parse()).isEqualTo(expect);
    }

    @Test
    public void should_return_1_when_input_1() {
        assertFizzBuzz("1", "1");
    }

    @Test
    public void should_return_Fizz_when_input_3() {
        assertFizzBuzz("3", "Fizz");
    }

    @Test
    public void should_return_Fizz_when_input_6() {
        assertFizzBuzz("6", "Fizz");
    }

    @Test
    public void should_return_Buzz_when_input_5() {
        assertFizzBuzz("5", "Buzz");
    }

    @Test
    public void should_return_Buzz_when_input_10() {
        assertFizzBuzz("10", "Buzz");
    }

    @Test
    public void should_return_Whizz_when_input_7() {
        assertFizzBuzz("7", "Whizz");
    }

    @Test
    public void should_return_Whizz_when_input_14() {
        assertFizzBuzz("14", "Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_input_15() {
        assertFizzBuzz("15", "FizzBuzz");
    }

    @Test
    public void should_return_FizzWhizz_when_input_21() {
        assertFizzBuzz("21", "FizzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_input_35() {
        assertFizzBuzz("35", "BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_input_105() {
        assertFizzBuzz("105", "FizzBuzzWhizz");
    }
}
