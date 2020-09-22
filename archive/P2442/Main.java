import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) { // i = 1
      printWhiteSpace(n - i);
      printOddNumberStar(i);
      System.out.println();
    }
    scanner.close();
  }

  private static void printWhiteSpace(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }

  private static void printOddNumberStar(int n) {
    for (int i = 0; i < 2 * n - 1; i++) {
      System.out.print("*");
    }
  }

}