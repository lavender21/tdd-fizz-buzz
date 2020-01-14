package tdd.practice;

public class WhizzRule extends Rule {
    private final String WHIZZ = "Whizz";

    public String match(int num) {
        if (isContains(num, BUZZ_NUM) && !isContains(num, WHIZZ_NUM)) {
            if (isMultiple(num, WHIZZ_NUM)) {
                return WHIZZ;
            }
        }
        if(isContains(num, WHIZZ_NUM) && isMultiple(num, WHIZZ_NUM)) {
            return WHIZZ;
        }
        if(notContainsAllRuleNums(num) && isMultiple(num, WHIZZ_NUM)) {
            return WHIZZ;
        }
        return "";
    }
}
