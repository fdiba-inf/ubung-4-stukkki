package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    double[] arr = new double[length];
    double min = 100000;

    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextDouble();
      if(min > arr[i]) {
        min = arr[i];
      }
}
    System.out.println("Min index: "+ min);
  

  }
}
