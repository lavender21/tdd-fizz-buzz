package tdd.practice;

import java.util.List;

public class Rule {

    protected boolean isMultiple(int num, int divisor) {
        return num % divisor == 0;
    }

    protected boolean isContains(int num, int base) {
        return String.valueOf(num).contains(String.valueOf(base));
    }

    protected boolean notContains(int num, List<Integer> list) {
        return list.stream().allMatch(item -> !isContains(num, item));
    }
}

