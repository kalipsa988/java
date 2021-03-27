import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "11 34 3 45 23 5 67";
        String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
            // System.out.println(numArr[i]);
        }
    }
        int i = 0;
        int res = 0;
        String text = "19 + 5 - 13 =";
        String[] words = text.split(" ");
        Integer[] chars = new Integer[]
        String[] wor = new String[6];

        i = 0;
        for(String word : words){
            wor[i] = word;
            i++;
        }
        for (i = 0; i<6;i++){
            System.out.println(wor[i]);
        }

        for (i = 0; i<6;i++){
            if(wor[i] == "+"){
                res += Integer.parseInt(wor[i-1]) +Integer.parseInt(wor[i+1]);
                System.out.print(res);
            }
            else if(wor[i] == "-"){
                res += Integer.parseInt(wor[i-1]) - Integer.parseInt(wor[i+1]);
            }
            else if(wor[i] == "=")break;
        }

        System.out.println(res);
    }
}