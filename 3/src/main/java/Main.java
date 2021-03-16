import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        int pol = 0;
        int ind = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число размер матрицы ");
        int x = in.nextInt();
        int xx = in.nextInt();
        System.out.print("Введите индекс: ");
        int y = in.nextInt();

        double [][]mas = new double[x][y];

        double max = 50;
        double min = -50;
        Random random = new Random();

        for(i = 0; i < x; i++) {
            for (int k=0; k<xx;k++){
                mas[i][k] = min +(max - min) * random.nextDouble();
                System.out.print(mas[i][k] + " ");
            }
            System.out.println(" ");
        }

        for(i = 0; i < x; i++) {
            for (int k=0; k<xx;k++){
                if(mas[i][k]>0){
                    pol++;
                    System.out.println("положение положительных чисел в массиве " + i + " " + k + " количество положительных чисел = "+ pol);
                }
                if (abs(i-k) == y){
                    ind++;
                    System.out.println("положение разности индексов в массиве " + i + " " + k + " количество разности индексов = " + ind);
                }
            }
        }
    }
}