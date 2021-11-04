package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   char[] ch = new char[size];
   char[] rev = new char[size];
   int j = 0;
   for (int i = 0; i < size; i++) {
     ch[i] = sc.next().charAt(0);
  }
  for (int i = size - 1; i >= 0; i--) {
    rev[j] = ch[i];
    j++;
  }
  String str = Arrays.toString(rev);
  System.out.println(str);
  }
}