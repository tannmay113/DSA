public class PatternPrintingProblems {

    public static void printStars(int n){

        if (n == 0) return;
        System.out.println("*");
    }

    private static void printSquare(int n, int row, int col){

        if(row == n) return;

      if (col == n){
          System.out.println();
          printSquare(n, row+1, 0);
          return;
      }

      System.out.print("* ");
      printSquare(n, row, col+1);

    }

    public static void main(String[] args) {

//      1. Print a line of n stars recursively.
        printStars(5);

        System.out.println();
        System.out.println();
//      2. Print a square of stars recursively (n×n).
        System.out.println("Square of stars");

        printSquare(5, 0, 0);
    }
}
