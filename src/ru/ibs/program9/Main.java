package ru.ibs.program9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива (размер массива должен быть > 0):");
        int length = input.nextInt();
        double[] array = new double[length];

        double sum=0;
        System.out.println("Введите значения массива");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "]=");
            array[i] = input.nextDouble();
            sum = sum + array[i];
        }
        double avg = sum/ array.length;
        System.out.println("Среднее арифметическое массива = "+ avg);

        //Вывод массива
        System.out.println("Вывод массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * avg;
            System.out.println("array[" + i + "] * "+avg+" = "+array[i]);
        }
    }
}
