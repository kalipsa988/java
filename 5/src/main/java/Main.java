import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число размер матрицы ");
        int x = in.nextInt();

        int []mas = new int[x];

        int max = 10;
        int min = 0;
        Random random = new Random();

        for(i = 0; i < x; i++) {
            mas[i] = random.nextInt(10);
        }

        int lastPosition = 0;
        for(i = 0; i<mas.length; i++) {
            if(mas[i] != 0) {
                mas[lastPosition++] = mas[i];
                System.out.print(mas[i] + " ");
                System.out.println(" ");
            }
        }
        for(i=lastPosition; i<mas.length; i++) {
            mas[i]=0;
            System.out.print(mas[i] + " ");
            System.out.println(" ");
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
        int count=0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число размер матрицы ");
        int x = in.nextInt();

        int []mas = new int[x];

        Random random = new Random();

        for(i = 0; i < x; i++) {
            mas[i] = random.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

        for(i=0; i<mas.length; i++) {
            if(mas[i]!= 0) {
                mas[lastPosition++] = mas[i];
            }else count++;
        }
        System.out.println(count);
        for( i=lastPosition; i<mas.length; i++) {
            mas[i]=0;
        }
        lastPosition = 0;
        for(i=count; i<mas.length; i++) {
            mas[i] = mas[lastPosition++];
        }
        for(i=0; i<count; i++) {
            mas[i] = 0;
        }

        for(i = 0; i < x; i++) {
            System.out.print(mas[i] + " ");
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
        int count=0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число размер матрицы ");
        int x = in.nextInt();

        int []mas = new int[x];

        Random random = new Random();

        for(i = 0; i < x; i++) {
            mas[i] = random.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

        for(i=0; i<mas.length; i++) {
            if(mas[i]!= 0) {
                mas[lastPosition++] = mas[i];
            }else count++;
        }
        System.out.println(count);
        for( i=lastPosition; i<mas.length; i++) {
            mas[i]=0;
        }
        lastPosition = 0;
        for(i=count; i<mas.length; i++) {
            mas[i] = mas[lastPosition++];
        }
        for(i=0; i<count; i++) {
            mas[i] = 0;
        }

        for(i = 0; i < x; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
