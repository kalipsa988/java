import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        float y;
        float x3;
        float mod;
        float tangens;
        float logarifm;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        float x  = in.nextFloat();

        x3 = (float) pow(x,3)/ ((float) pow(x,3) +1);
        tangens = (float) pow(5,tan(x));
        mod = (float)  pow(abs(x),sin(x));//модуль
        logarifm = (float) log10(tangens + mod) / (float) log10(5);

        y = (float) pow(acos(x3),3) + (float) pow(sqrt(sqrt(Math.abs(x) + 1 )),7) + (float) pow(log(logarifm),2);
        System.out.println(y);
        if(y == 5) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
