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
    public void return_Fizz_when_input_is_30_contain3_but_not_contain5() {
        assertFizzBuzz(30, "Fizz");
    }

    @Test
    public void return_Fizz_when_input_is_37_contain_3_and_7() {
        assertFizzBuzz(37, "Fizz");
    }

    @Test
    public void return_Fizz_when_input_is_357_contain_3_and_7_and5() {
        assertFizzBuzz(357, "Fizz");
    }

    @Test
    public void return_Buzz_when_input_is_15_contain5_not_contain7() {
        assertFizzBuzz(15, "Buzz");
    }

    @Test
    public void return_Whizz_when_input_is_252_contain5_and_multiple7() {
        assertFizzBuzz(252, "Whizz");
    }

    @Test
    public void return_BuzzWhizz_when_input_is_35_contain5_and_multiple7_and5() {
        assertFizzBuzz(35, "BuzzWhizz");
    }

    @Test
    public void return_Fizz_when_input_is_177_contain7_and_multiple3() {
        assertFizzBuzz(177, "Fizz");
    }

    @Test
    public void return_Fizz_when_input_is_57_contain7_and_multiple3() {
        assertFizzBuzz(57, "Fizz");
    }

    @Test
    public void return_Whizz_when_input_is_70_contain7_and_multiple7() {
        assertFizzBuzz(70, "Whizz");
    }

    @Test
    public void return_Whizz_when_input_is_175_contain7_and_multiple7() {
        assertFizzBuzz(175, "Whizz");
    }

    @Test
    public void return_FizzWhizz_when_input_is_147_contain7_and_multiple7_and3() {
        assertFizzBuzz(147, "FizzWhizz");
    }

    @Test
    public void return_Fizz_when_input_is_9_multiple3() {
        assertFizzBuzz(9, "Fizz");
    }

    @Test
    public void return_Buzz_when_input_is_20_multiple5() {
        assertFizzBuzz(20, "Buzz");
    }

    @Test
    public void return_Whizz_when_input_is_49_multiple7() {
        assertFizzBuzz(49, "Whizz");
    }

    @Test
    public void return_FizzBuzz_when_input_is_60_multiple3_and5() {
        assertFizzBuzz(60, "FizzBuzz");
    }

    @Test
    public void return_FizzWhizz_when_input_is_21_multiple3_and7() {
        assertFizzBuzz(21, "FizzWhizz");
    }

    @Test
    public void return_BuzzWhizz_when_input_is_140_multiple5_and7() {
        assertFizzBuzz(140, "BuzzWhizz");
    }

    @Test
    public void return_FizzBuzzWhizz_when_input_is_210_multiple5_and7_and3() {
        assertFizzBuzz(210, "FizzBuzzWhizz");
    }

    @Test
    public void return_1_when_input_is_1_no_multiple_no_contains() {
        assertFizzBuzz(1, "1");
    }

    @Test void return_1_to_200_fizz_buzz_game_result() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String result = "";
        for( int i = 1; i <= 200; i++) {
            result += fizzBuzzGame.say(i) + " ";
        }

        String expect = "1 2 Fizz 4 Buzz Fizz Whizz 8 Fizz Buzz 11 Fizz Fizz Whizz Buzz 16 17 Fizz 19 Buzz FizzWhizz 22 Fizz Fizz Buzz 26 Fizz Whizz 29 Fizz Fizz Fizz Fizz Fizz BuzzWhizz Fizz Fizz Fizz Fizz Buzz 41 FizzWhizz Fizz 44 Buzz 46 47 Fizz Whizz Buzz 51 52 53 54 Buzz Whizz Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Whizz 71 Fizz Fizz 74 Fizz 76 Whizz Fizz 79 Buzz Fizz 82 Fizz FizzWhizz Buzz 86 Fizz 88 89 FizzBuzz Whizz 92 Fizz 94 Buzz Fizz 97 Whizz Fizz Buzz 101 Fizz Fizz 104 BuzzWhizz 106 107 Fizz 109 Buzz Fizz Whizz Fizz Fizz Buzz 116 Fizz 118 Whizz FizzBuzz 121 122 Fizz 124 Buzz FizzWhizz 127 128 Fizz Fizz Fizz Fizz Fizz Fizz Buzz Fizz Fizz Fizz Fizz BuzzWhizz Fizz 142 Fizz Fizz Buzz 146 FizzWhizz 148 149 Buzz 151 152 153 Whizz Buzz 156 157 158 159 Buzz Whizz Fizz Fizz 164 Buzz 166 167 FizzWhizz 169 170 Fizz 172 Fizz Fizz Whizz 176 Fizz 178 179 FizzBuzz 181 Whizz Fizz 184 Buzz Fizz 187 188 FizzWhizz Buzz 191 Fizz Fizz 194 Buzz Whizz 197 Fizz 199 Buzz ";
        assertThat(result).isEqualTo(expect);
    }

    private void assertFizzBuzz(int input, String result) {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertThat(fizzBuzzGame.say(input)).isEqualTo(result);
    }
}
