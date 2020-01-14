package tdd.practice;

import java.util.Arrays;

public class BuzzRule extends Rule {
    private final String BUZZ = "Buzz";

    public String match(int num) {
        if (isContains(num, BUZZ_NUM) && !isContains(num, WHIZZ_NUM)) {
            if (isMultiple(num, BUZZ_NUM)) {
                return BUZZ;
            }
        }
        if(notContainsAllRuleNums(num) && isMultiple(num, BUZZ_NUM)) {
            return BUZZ;
        }
        return "";
    }
}
