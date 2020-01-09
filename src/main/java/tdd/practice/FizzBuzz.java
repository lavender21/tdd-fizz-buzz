package tdd.practice;

public class FizzBuzz {
    private String num;

    public FizzBuzz(String input) {
        num = input;
    }
    public String parse() {
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
