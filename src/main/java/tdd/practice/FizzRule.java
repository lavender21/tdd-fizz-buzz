package tdd.practice;

public class FizzRule extends Rule {
    private final String FIZZ = "Fizz";

    public String match(int num) {
        if (isContains(num, FIZZ_NUM)){
            if (!isContains(num, BUZZ_NUM) || isContains(num, WHIZZ_NUM)) {
                return FIZZ;
            }
        }
        if(isContains(num, WHIZZ_NUM) && !isContains(num, FIZZ_NUM)) {
            if (isMultiple(num, FIZZ_NUM)) {
                return FIZZ;
            }
        }
        if(notContainsAllRuleNums(num) && isMultiple(num, FIZZ_NUM)) {
            return FIZZ;
        }
        return "";
    }
}