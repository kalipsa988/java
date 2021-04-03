import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число размер матрицы ");
        int x = in.nextInt();
        int y = in.nextInt();

        int [][]mas = new int[x][y];

        int max = 50;
        int min = -50;
        Random random = new Random();

        for(i = 0; i < x; i++) {
            for (int k=0; k<y;k++){
                mas[i][k] = random.nextInt(50) -50;
                System.out.print(mas[i][k] + " ");
            }
            System.out.println(" ");
        }
        System.out.print("Введите диапазон: ");
        int minDip = in.nextInt();
        int maxDip = in.nextInt();

        for(i = 0; i < x; i++) {
            for (int k=0; k<y;k++){
                if((mas[i][k] > minDip &&(mas[i][k] < maxDip))){
                    System.out.println("True");
                }
                else System.out.println("False");
            }
        }

    }
}

import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        int lastPosition = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число размер матрицы ");
        int x = in.nextInt();

        int []mas = new int[x];

        Random random = new Random();

        for(i = 0; i < x; i++) {
                mas[i] = random.nextInt(10) ;
                System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

        for(i=0; i<mas.length; i++) {
                if(mas[i]!= 0) {
                    mas[lastPosition++] = mas[i];
                }
        }

        for( i=lastPosition; i<mas.length; i++) {
            mas[i]=0;
        }

        for(i = 0; i < x; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
