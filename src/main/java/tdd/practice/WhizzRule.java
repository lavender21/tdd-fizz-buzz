package tdd.practice;

public class WhizzRule extends Rule {
    private final String WHIZZ = "Whizz";

    public String match(int num) {
        if (isContains(num, 5) && !isContains(num, 7)) {
            if (isMultiple(num, 7)) {
                return WHIZZ;
            }
        }
        return "";
    }
}
