package tdd.practice;

public class Rules {
    private String num;

    public Rules(String input) {
        num = input;
    }

    public boolean fizzMatcher() {
        return isMultiple(3);
    }

    public boolean buzzMatcher() {
        return isMultiple(5);
    }

    public boolean whizzMatcher() {
        return isMultiple(7);
    }

    public boolean fizzBuzzMatcher() {
        return isMultiple(3) && isMultiple(5);
    }

    public boolean fizzWhizzMatcher() {
        return isMultiple(3) && isMultiple(7);
    }

    public boolean buzzWhizzMatcher() {
        return isMultiple(5) && isMultiple(7);
    }

    public boolean fizzBuzzWhizzMatcher() {
        return isMultiple(3) && isMultiple(5) && isMultiple(7);
    }

    private boolean isMultiple(int i) {
        return Integer.parseInt(num) % i == 0;
    }
}
