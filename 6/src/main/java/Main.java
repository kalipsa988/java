import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = "19 + 5 - 13 =";
        String[] words = text.split(" ");
        int[] numbers = new int[6];
        int res = 0;
        for (String word : words) {
        }

        numbers[0] = Integer.parseInt(words[0]);
        numbers[1] = Integer.parseInt(words[2]);
        numbers[2] = Integer.parseInt(words[4]);


        if(words[1].equals("+")){
            res = numbers[0] + numbers[1];
        }else if (words[1].equals("-")){
            res = numbers[0] - numbers[1];
        }else if (words[1].equals("*")){
            res = numbers[0] * numbers[1];
        }else{
            res = numbers[0] / numbers[1];
        }
        if(words[3].equals("+")){
            res = res + numbers[2];
        }else if (words[3].equals("-")){
            res = res - numbers[2];
        }else if (words[3].equals("*")){
            res = res * numbers[2];
        }else{
            res = res / numbers[2];
        }

        System.out.println(res);


    }
}