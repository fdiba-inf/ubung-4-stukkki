package exercise4;


import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
       
        int size = sc.nextInt();
        
        int[] numbers = new int [size];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = sc.nextInt();
        }
        for (int index = 0; index < numbers.length; index++) {
            for (int space = 0; space < index; space++) {
             System.out.print(" ");
            }            
            System.out.println(numbers[index]);   
        }
    }
}