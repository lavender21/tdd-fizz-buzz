package tdd.practice;

public class FizzBuzzGame {
    public String say(int num) {
        if (isContains(num, 3)){
            if (!isContains(num, 5) || isContains(num, 7)) {
                return "Fizz";
            }
        }
        if (isContains(num, 5) && !isContains(num, 7)) {
            if (num % 5 == 0) {
                return "Buzz";
            }
        }
        return null;
    }

    private boolean isContains(int num, int base) {
        return String.valueOf(num).contains(String.valueOf(base));
    }
}
