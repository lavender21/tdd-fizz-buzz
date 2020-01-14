package tdd.practice;

public class FizzRule extends Rule {
    private final String FIZZ = "Fizz";

    public String match(int num) {
        if (isContains(num, FIZZ_NUM) || isMultiple(num, FIZZ_NUM)){
            return notContains(num, BUZZ_NUM) ? FIZZ : "";
        }
        return "";
    }

}