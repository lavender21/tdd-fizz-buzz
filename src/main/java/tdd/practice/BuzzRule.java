package tdd.practice;

public class BuzzRule extends Rule {
    private final String BUZZ = "Buzz";

    public String match(int num) {
        if (notContains(num, WHIZZ_NUM) || notContainsAllRuleNums(num)) {
            return isMultiple(num, BUZZ_NUM) ? BUZZ : "";
        }
        return "";
    }
}
