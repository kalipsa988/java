import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double y, arccos, kor, logarifm;

        //эти строчки ниже для ввода значения переменной с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double x  = in.nextDouble();

        arccos = pow(acos(pow(x,3)/ ( pow(x,3) +1)),3);//тут высчитывается аркосинус
        kor = pow(sqrt(abs(x) + 1 ),1/7);//тут высчитывается корень
        logarifm = pow(log(log(pow(5,tan(x)) + pow(abs(x),sin(x))) / log(5)),2);//тут высчитывается логарифм

        y = arccos + kor +  logarifm;//тут собирается уравнение из 3х частей

        if((y >= 0) & (x>= 0 )& (pow(x,2) + pow(y,2) <= 25)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}