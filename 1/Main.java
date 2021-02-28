import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        float y, arccos, kor, logarifm;

        //эти строчки ниже для ввода значения переменной с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        float x  = in.nextFloat();

        arccos = (float) pow(acos(pow(x,3)/ ((float) pow(x,3) +1)),3);//тут высчитывается аркосинус
        kor =(float) pow(sqrt(sqrt(abs(x) + 1 )),7);//тут высчитывается корень
        logarifm = (float) pow(log(log10(pow(5,tan(x)) + (float)  pow(abs(x),sin(x))) / (float) log10(5)),2);//тут высчитывается логарифм

        y = arccos + kor +  logarifm;//тут собирается уравнение из 3х частей

        if(y <= 5) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}