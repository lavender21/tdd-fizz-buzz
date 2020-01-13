package tdd.practice;


public class FizzBuzzGame {
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String WHIZZ = "Whizz";

    public String say(int num) {
        String result = "";
        FizzRule fizzRule = new FizzRule();
        result = fizzRule.match(num);

        if (isContains(num, 5) && !isContains(num, 7)) {
            if (isMultiple(num, 5)) {
                result = BUZZ;
            }
            if (isMultiple(num, 7)) {
                result += WHIZZ;
            }
            return result;
        }
        return result;
    }

    private boolean isMultiple(int num, int divisor) {
        return num % divisor == 0;
    }

    private boolean isContains(int num, int base) {
        return String.valueOf(num).contains(String.valueOf(base));
    }
}
