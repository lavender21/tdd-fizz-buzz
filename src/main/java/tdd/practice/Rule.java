package tdd.practice;

import java.util.Arrays;
import java.util.List;

public class Rule {
    protected Integer FIZZ_NUM = 3;
    protected Integer BUZZ_NUM = 5;
    protected Integer WHIZZ_NUM = 7;
    protected List<Integer> ruleNumList = Arrays.asList(FIZZ_NUM, BUZZ_NUM, WHIZZ_NUM);

    protected boolean isMultiple(int num, int divisor) {
        return num % divisor == 0;
    }

    protected boolean isContains(int num, int base) {
        return String.valueOf(num).contains(String.valueOf(base));
    }

    protected boolean notContainsAllRuleNums(int num) {
        return ruleNumList.stream().allMatch(item -> !isContains(num, item));
    }

    protected boolean notContains(int num, int base) {
        return !isContains(num, base);
    }
}

