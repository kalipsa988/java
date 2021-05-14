import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        int z;
        int j;
        int y;
        int lastPosition = 0;
        int count=0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число размер матрицы ");
        int x = in.nextInt();

        int []mas = new int[x];

        Random random = new Random();

        for(i = 0; i < x; i++) {
            mas[i] = random.nextInt(5);
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

        for(i=0; i<mas.length; i++) {
            if(mas[i]!= 0) {
                mas[lastPosition++] = mas[i];
            }else count++;
        }

        for( i=lastPosition; i<mas.length; i++) {
            mas[i]=0;
        }

        if(count!=0) {

            count--;
            for(j=0; j<=count; j++) {
                y=x-1;
                for(i=y; i>=1; i--) {
                    z=mas[i-1];
                    mas[i] = z;
                }
                mas[0]=0;
            }
        }
        for(i = 0; i < x; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
