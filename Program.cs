using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            string[,] mass = new string[4,9];

            //заполнение матрицы * и -
            for (int i = 0; i < mass.GetLength(0); i++)
            {
                int countStars = i * 2 + 1;

                for (int j = 0; j < mass.GetLength(1); j++)
                {
                    mass[i, j] = "-";
                }
                while(countStars > 0)
                {
                    Random rnd = new Random();
                    int randomIndex = rnd.Next(0, mass.GetLength(1));
                    if (mass[i,randomIndex] != "*")
                    {
                        mass[i, randomIndex] = "*";
                        countStars--;
                    }
                }
            }

            PrintMass(mass);

            //перенос * в центр
            for (int i = 0; i < mass.GetLength(0); i++)
            {
                int countStars = i * 2 + 1;
                int length = (mass.GetLength(1) - countStars) / 2;

                for (int j = 0; j < mass.GetLength(1); j++)
                {
                    if (j < length)
                    {
                        mass[i, j] = "-";
                    }
                    else if(j>= length + countStars)
                    {
                        mass[i, j] = "-";
                    }
                    else
                    {
                        mass[i, j] = "*";
                    }
                }
            }

            PrintMass(mass);
            
            void PrintMass(string[,] mass)
            {
                for (int i = 0; i < mass.GetLength(0); i++)
                {
                    for (int j = 0; j < mass.GetLength(1); j++)
                    {
                        Console.Write(mass[i, j]);
                    }
                    Console.WriteLine();
                }
            }
        }
    }
}
