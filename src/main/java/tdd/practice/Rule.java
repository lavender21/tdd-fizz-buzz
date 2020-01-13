package tdd.practice;

public class Rule {

    protected boolean isMultiple(int num, int divisor) {
        return num % divisor == 0;
    }

    protected boolean isContains(int num, int base) {
        return String.valueOf(num).contains(String.valueOf(base));
    }
}

