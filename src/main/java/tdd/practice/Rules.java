package tdd.practice;

public class Rules {
    private String num;

    public Rules(String input) {
        num = input;
    }

    public boolean fizzMatcher() {
        if (isContains("7")) {
            return isContains("3") || isMultiple(3);
        }
        if (isContains("5")) {
            return false;
        }
        return isContains("3") || isMultiple(3);
    }

    public boolean buzzMatcher() {
        if (isContains("7")) {
            return false;
        }
        return isContains("5") || isMultiple(5);
    }

    public boolean whizzMatcher() {
        return isMultiple(7);
    }

    public boolean fizzBuzzMatcher() {
        if (isContains("7")) {
            return false;
        }
        return isMultiple(3) && isMultiple(5) && !isContains("3");
    }

    public boolean fizzWhizzMatcher() {
        if (isContains("3")) {
            return false;
        }
        return isMultiple(3) && isMultiple(7);
    }

    public boolean buzzWhizzMatcher() {
        if (isContains("7")) {
            return false;
        }
        return isMultiple(5) && isMultiple(7);
    }

    public boolean fizzBuzzWhizzMatcher() {
        if (isContains("7")) {
            return false;
        }
        return isMultiple(3) && isMultiple(5) && isMultiple(7);
    }

    private boolean isMultiple(int i) {
        return Integer.parseInt(num) % i == 0;
    }

    private boolean isContains(String str) {
        return num.contains(str);
    }
}
