package tdd.practice;

public class FizzRule extends Rule {
    private final String FIZZ = "Fizz";

    public String match(int num) {
        if (isContains(num, BUZZ_NUM) && notContains(num, WHIZZ_NUM)) {
            return "";
        }
        if (isContains(num, FIZZ_NUM) || isMultiple(num, FIZZ_NUM)){
            return FIZZ;
        }
        return "";
    }

}