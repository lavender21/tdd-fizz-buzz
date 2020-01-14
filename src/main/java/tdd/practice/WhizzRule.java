package tdd.practice;

public class WhizzRule extends Rule {
    private final String WHIZZ = "Whizz";

    public String match(int num) {
        if (isContains(num, FIZZ_NUM) && notContains(num, BUZZ_NUM) || containsAllRuleNums(num)) {
            return "";
        }
        return isMultiple(num, WHIZZ_NUM) ? WHIZZ : "";
    }

}
