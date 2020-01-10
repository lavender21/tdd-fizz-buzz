package tdd.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FizzBuzzPrinter {

    public void print(Integer length) {
        try {
            FileWriter fw = new FileWriter("fizzBuzzOutput", true);
            BufferedWriter bw = new BufferedWriter(fw);
            for( int i = 1; i <= 1024; i++) {
                FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(i);
                bw.write(i + " " + fizzBuzzGame.parse());
                bw.newLine();
                System.out.println(i + " " + fizzBuzzGame.parse());
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
