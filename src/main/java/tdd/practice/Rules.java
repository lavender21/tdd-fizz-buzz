package tdd.practice;

public class Rules {
    private String num;

    public Rules(String input) {
        num = input;
    }

    public boolean fizzMatcher() {
        return isMultiple(3);
    }

    private boolean isMultiple(int i) {
        return Integer.parseInt(num) % i == 0;
    }
}
