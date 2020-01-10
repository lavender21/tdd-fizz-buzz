package tdd.practice;

public class FizzBuzzGame {
    public String handleNumber(int num) {
        String result = "";
        if (isMultiple(num, 3)) {
            result = "Fizz";
        }
        if (isMultiple(num, 5)) {
            result += "Buzz";
        }
        if (isMultiple(num, 7)) {
            result += "Whizz";
        }

        if (Integer.toString(num).contains("3")) {
            result = "Fizz";
        }
        return result.length() > 0 ? result :Integer.toString(num);
    }

    private boolean isMultiple(int num, int i) {
        return num % i == 0;
    }
}
