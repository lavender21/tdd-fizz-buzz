package tdd.practice;


public class FizzBuzzGame {

    public String say(int num) {
        String result = "";
        FizzRule fizzRule = new FizzRule();
        BuzzRule buzzRule = new BuzzRule();
        WhizzRule whizzRule = new WhizzRule();

        result = fizzRule.match(num);
        result += buzzRule.match(num);
        result += whizzRule.match(num);

        return result;
    }
}
