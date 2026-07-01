package TCS_NQT;

/* https://www.youtube.com/watch?v=TyRmYTcyuHQ (1:24:00 - end)
 * Question: 
 * Find the Nth term of the following series: 
    The series is a mixture of two separate geometric progressions (GP):
    Odd positions (1st, 3rd, 5th...): 1, 2, 4, 8, 16, 32, 64, 128...
    This is a GP where the first term is 1 and the common ratio is 2.
    Even positions (2nd, 4th, 6th...): 1, 3, 9, 27, 81, 243, 729, 2187...
    This is a GP where the first term is 1 and the common ratio is 3.

* Coding Requirements:
    Input: Read a positive integer 
     from standard input.
    Output: Print only the Nth term to standard output (no extra text).
    Constraint: 
     will not exceed 30.
💡 Example: If n = 16 it is an even number. 
 */ 
import java.util.Scanner;

public class PYQ6 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<1){
            System.out.println("-1");
            sc.close();
            return;
        }
		if(n%2 == 0){ /*even case*/
		    int pow = (n-2)/2;
		    int result = (int)Math.pow(3,pow);
		    System.out.println(result);
		}else{/*odd case*/
		    int pow = (n-1)/2;
		    int result = (int)Math.pow(2,pow);
		    System.out.println(result);
		}
		sc.close();
	}
}
