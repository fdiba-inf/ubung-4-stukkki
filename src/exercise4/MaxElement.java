package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    double[] arr = new double[length];
    double max = -10000;

    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextDouble();
      if(max < arr[i]) {
        max = arr[i];
      }
}
    System.out.println("Max number: " + max);
  }
}

    