package tdd.practice;

public class FizzBuzzGame {
    public String handleNumber(int num) {
        if (isMultiple(num, 3)) {
            return "Fizz";
        }
        if (isMultiple(num, 5)) {
            return "Buzz";
        }
        if (isMultiple(num, 7)) {
            return "Whizz";
        }
        return Integer.toString(num);
    }

    private boolean isMultiple(int num, int i) {
        return num % i == 0;
    }
}
