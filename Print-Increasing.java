import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printIncreasing(n);
  }

  public static void printIncreasing(int n) {

    if (n == 0) {
      return ;
    }
    // call
    printIncreasing(n - 1);
    // difference b/w expectations and faith
    System.out.println(n);

  }

}
