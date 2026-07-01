package TCS_NQT;

import java.util.Scanner;

/* https://www.youtube.com/watch?v=TyRmYTcyuHQ (1:24:00 - end)
 * Question: 
 * An automobile company manufactures both a two-wheeler (TW) and a four-wheeler (FW). A company manager wants 
 * to make the production of both types of vehicle according to the given data below: 1st data, 
 * Total number of vehicle (two-wheeler + four-wheeler)=v 2nd data, Total number of wheels = W. 
 * The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data."
 */
public class PYQ5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int w = sc.nextInt();

		if (w % 2 != 0 || w < 2 * v || w > 4 * v) {
			System.out.println("-1");
			sc.close();
			return;
		}
		int y = (w - 2 * v) / 2;
		int x = v - y;
 
		System.out.println(x + " " + y);
		sc.close();
	}
}
