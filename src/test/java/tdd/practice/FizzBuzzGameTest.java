package tdd.practice;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/*
包含3 不包含5或
包含3和7
    全部输出Fizz
    13 Fizz
    30 Fizz
    63 Fizz
    37 Fizz
    203 Fizz
包含5 不包含7
    5的倍数 Buzz
    15 Buzz
    7的倍数 Whizz
    252 Whizz
    5，7的倍数 BuzzWhizz
    35 BuzzWhizz

包含7 不包含3
    3的倍数 Fizz
    7的倍数 Whizz
    3，7的倍数 FizzWhizz

不包含3，5，7，
    3的倍数 Fizz
    5的倍数 Buzz
    7的倍数 Whizz
    3，5的倍数 FizzBuzz
    3，7的倍数 FizzWhizz
    5，7的倍数 BuzzWhizz
    3，5，7的倍数 FizzBuzzWhizz

默认数字本身
 */
public class FizzBuzzGameTest {
    @Test
    public void return_Fizz_when_input_is_13_contain3_but_not_contain5() {
        assertFizzBuzz(13, "Fizz");
    }

    @Test
    public void return_Fizz_when_input_is_37_contain_3_and_7() {
        assertFizzBuzz(37, "Fizz");
    }

    @Test
    public void return_Buzz_when_input_is_15_contain5_not_contain7() {
        assertFizzBuzz(15, "Buzz");
    }

    private void assertFizzBuzz(int input, String result) {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertThat(fizzBuzzGame.say(input)).isEqualTo(result);
    }
}
