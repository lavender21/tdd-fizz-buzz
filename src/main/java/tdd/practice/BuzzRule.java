package tdd.practice;

public class BuzzRule extends Rule {
    private final String BUZZ = "Buzz";

    public String match(int num) {
        if (isContains(num, FIZZ_NUM) && notContains(num, BUZZ_NUM)) {
            return "";
        }
        if (notContains(num, WHIZZ_NUM)) {
            return isMultiple(num, BUZZ_NUM) ? BUZZ : "";
        }
        return "";
    }
}
