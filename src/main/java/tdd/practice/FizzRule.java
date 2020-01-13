package tdd.practice;

public class FizzRule extends Rule {
    private final String FIZZ = "Fizz";

    public String match(int num) {
        if (isContains(num, 3)){
            if (!isContains(num, 5) || isContains(num, 7)) {
                return FIZZ;
            }
        }
        if(isContains(num, 7) && !isContains(num, 3)) {
            if (isMultiple(num, 3)) {
                return FIZZ;
            }
        }
        if(!isContains(num, 3) && !isContains(num, 5) && !isContains(num, 7) && isMultiple(num, 3)) {
            return FIZZ;
        }
        return "";
    }
}