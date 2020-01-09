package tdd.practice;

public class FizzBuzz {
    private String num;

    public FizzBuzz(String input) {
        num = input;
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
        return num;
    }

    private boolean isMultiple(int i) {
        return Integer.parseInt(num) % i == 0;
    }
}
