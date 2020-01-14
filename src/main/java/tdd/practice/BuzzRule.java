package tdd.practice;

import java.util.Arrays;

public class BuzzRule extends Rule {
    private final String BUZZ = "Buzz";

    public String match(int num) {
        if (isContains(num, 5) && !isContains(num, 7)) {
            if (isMultiple(num, 5)) {
                return BUZZ;
            }
        }
        if(notContains(num, Arrays.asList(3,5,7)) && isMultiple(num, 5)) {
            return BUZZ;
        }
        return "";
    }
}
