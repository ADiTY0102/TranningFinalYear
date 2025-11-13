package DAY_02;

public class LoopsName {
    public static void printNameByStars(){
        int n = 5; 

        for (int i = 1; i <= n; i++) {
            // A
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 3 || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); 

            
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || (j == n && i != 1 && i != n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == (n+1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == (n+1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            
            for (int j = 1; j <= n; j++) {
                if ((i <= n/2 && (j == i || j == n - i + 1)) || (i > n/2 && j == (n+1)/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 3 || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNameByStars();
    }
}
