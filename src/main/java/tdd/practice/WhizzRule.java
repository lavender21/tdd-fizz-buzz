package tdd.practice;

import java.util.Arrays;

public class WhizzRule extends Rule {
    private final String WHIZZ = "Whizz";

    public String match(int num) {
        if (isContains(num, BUZZ_NUM) && !isContains(num, WHIZZ_NUM)) {
            if (isMultiple(num, WHIZZ_NUM)) {
                return WHIZZ;
            }
        }
        if(notContains(num, Arrays.asList(FIZZ_NUM, BUZZ_NUM)) && isMultiple(num, WHIZZ_NUM)) {
            return WHIZZ;
        }
        return "";
    }
}
