package main;

import solution.Solution;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i]=scanner.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.maxTurbulenceSize(array);
        System.out.println(result);
    }
}
