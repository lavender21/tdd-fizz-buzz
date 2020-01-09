package tdd.practice;

public class FizzBuzzGame {
    private String num;
    private Rules rules;

    public FizzBuzzGame(String input) {
        num = input;
        rules = new Rules();
    }
    public String parse() {
        if (isMultiple(3) && isMultiple(5) && isMultiple(7)) {
            return "FizzBuzzWhizz";
        }
        if (isMultiple(3) && isMultiple(5)) {
            return "FizzBuzz";
        }
        if (isMultiple(3) && isMultiple(7)) {
            return "FizzWhizz";
        }
        if (isMultiple(5) && isMultiple(7)) {
            return "BuzzWhizz";
        }
        if (isMultiple(3)) {
            return "Fizz";
        }
        if (isMultiple(5)) {
            return "Buzz";
        }
        if (isMultiple(7)) {
            return "Whizz";
        }
        return rules.parse(num);
    }

    private boolean isMultiple(int i) {
        return Integer.parseInt(num) % i == 0;
    }
}
