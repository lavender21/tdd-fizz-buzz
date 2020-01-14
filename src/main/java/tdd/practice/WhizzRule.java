package tdd.practice;

import java.util.Arrays;

public class WhizzRule extends Rule {
    private final String WHIZZ = "Whizz";

    public String match(int num) {
        if (isContains(num, 5) && !isContains(num, 7)) {
            if (isMultiple(num, 7)) {
                return WHIZZ;
            }
        }
        if(isContains(num, 7) && isMultiple(num, 7)) {
            return WHIZZ;
        }
        if(notContains(num, Arrays.asList(3,5,7)) && isMultiple(num, 7)) {
            return WHIZZ;
        }
        return "";
    }
}
