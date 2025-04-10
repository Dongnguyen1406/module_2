package bai_tap.StopWatch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        int[] numbers = new int[100000];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        StopWatch watch = new StopWatch();

        watch.start(); 

        SelectionSort.selectionSort(numbers); 

        watch.stop(); 

        System.out.println("Thời gian thực thi thuật toán selection sort là: " + watch.getElapsedTime() + " milliseconds");
    }
}

