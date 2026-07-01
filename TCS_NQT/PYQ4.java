package TCS_NQT;

import java.util.Scanner;

/* https://www.youtube.com/watch?v=TyRmYTcyuHQ (1:15:25 - end)
 * Question: 
 * N numbere of bulbs initially off 
 * toggle all the bulbs 
 * toggle all the 2nd bulbs
 * toggle all the 3rd bulbs
 * ....
 * toggle all the Nth bulbs
 * EXAMPLE:
 * N =3 
 * 1st -> 💡 💡 💡
 * 2nd -> 💡 _  💡
 * 3rd -> 💡 _  _
 * 
 * Output -> 1;
 * 
 * Simply take examnple of n-=20 and you will clearly see that:
 * if intration is even then bulb will be off
 * if intration is odd then bulb will be on
 * So then just count the odd iteration you see that : 1 4 9 16 these are perfact sq.
 * so to find the solution you nahve to calculate  number of perfact squares for given n;
 * 
 * if n=3 -> perfact sq. are 1 -> 1💡bulb ison
 * if n=8 -> perfact sq. are 1 4 -> 2 💡bulbs are on
 * if n=9 -> perfact sq. are 1 4 9 -> 3 💡bulbs are on
 * .
 * .
 * .
 * if n=100 -> perfact sq. are 1 4 9 16 25 36 49 64 81 100 therefore solution is 10 💡bulbs are on
 * 
 * 
 */
public class PYQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int tp = (int) Math.sqrt(n);
        System.out.println(tp);
        sc.close();
    }
}
