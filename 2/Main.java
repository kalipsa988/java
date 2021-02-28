import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float y;

        //эти строчки ниже для ввода значения переменной с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число х: ");
        float x = in.nextFloat();

        if(x<=3){//первое уравнение
            y = (float) log(abs(pow(2,x) + pow(x,7) + pow(abs(x-4),x)));
            System.out.println(y);
        }
        else {
            System.out.println("Значение х неверно");
        }

        if((x<5)&(x>3)){//второе уравнение
            y = (float) pow(log10(pow(x/(1+pow(x,2)),4)),9);
            System.out.println(y);
        }
        else {
            System.out.println("Значение х неверно");
        }

        if(x>=5){//третье уравнение
            y = (float) acos((1/x) + 1);
            System.out.println(y);
        }
        else {
            System.out.println("Значение х неверно");
        }
    }
}
