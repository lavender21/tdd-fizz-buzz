package tdd.practice;

public class BuzzRule extends Rule {
    private final String BUZZ = "Buzz";

    public String match(int num) {
        if (!isContains(num, WHIZZ_NUM) || notContainsAllRuleNums(num)) {
            return isMultiple(num, BUZZ_NUM) ? BUZZ : "";
        }
        return "";
    }
}
