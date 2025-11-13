package DAY_02;

//E F H I L N Z 
public class LoopsStar {
    public static void printLpattern(String s) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 5 || j == 1) {
                    System.out.print(s);
                }
            }
            System.out.println();
        }
    }

    public static void printEpattern(String s) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5 || j == 1) {
                    System.out.print(s);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printFpattern(String s) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || j == 5) {
                    System.out.print(s);
                }
            }
            System.out.println();
        }
    }

    public static void printHpattern(String s) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 || j == 1 || j == 5) {
                    System.out.print(s);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printIpattern(String s) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 3) {
                    System.out.print(s);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printNpattern(String s) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == j) {
                    System.out.print(s);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printZpattern(String s) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || i + j == 6) {
                    System.out.print(s);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printGpattern(String s){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1|| i==5 || (j==5 && i!=2 && i!=5) ||(i==3 && j>=3)){
                    System.out.print(s);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printLpattern("*");
        System.out.println();
        printEpattern("*");
        System.out.println();
        printFpattern("*");
        System.out.println();
        printHpattern("*");
        System.out.println();
        printIpattern("*");
        System.out.println();
        printNpattern("*");
        System.out.println();
        printZpattern("*");
        System.out.println();
        printGpattern("*");
    }
}
