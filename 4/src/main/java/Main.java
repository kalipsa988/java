import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы ");
        int x = in.nextInt();
        int y = in.nextInt();

        boolean [][]mas = new boolean[x][y];

        Random random = new Random();

        for(i = 0; i < x; i++) {
            for (int k=0; k<y;k++){
                mas[i][k] = true;//random.nextBoolean();
                System.out.print(mas[i][k] + " ");
            }
            System.out.println(" ");
        }
    }
}