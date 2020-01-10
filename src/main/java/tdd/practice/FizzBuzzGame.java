package tdd.practice;

public class FizzBuzzGame {
    private Integer num;
    private Rules rules;

    public FizzBuzzGame(Integer input) {
        num = input;
        rules = new Rules(num);
    }
    public String parse() {
        if (rules.fizzBuzzWhizzMatcher()) {
            return "FizzBuzzWhizz";
        }
        if (rules.fizzBuzzMatcher()) {
            return "FizzBuzz";
        }
        if (rules.fizzWhizzMatcher()) {
            return "FizzWhizz";
        }
        if (rules.buzzWhizzMatcher()) {
            return "BuzzWhizz";
        }
        if (rules.fizzMatcher()) {
            return "Fizz";
        }
        if (rules.buzzMatcher()) {
            return "Buzz";
        }
        if (rules.whizzMatcher()) {
            return "Whizz";
        }
        return Integer.toString(num);
    }
}
