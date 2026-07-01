package TCS_NQT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PYQ7 {
    	public static void main(String[] args) {
	    // [10,12,5,40,30,7,59,10]
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = {10,12,5,40,30,7,59,10};
		
		List<Integer> nonMulTen = new ArrayList<>();
		List<Integer> multOfTen = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++){
		    if(arr[i]%10 != 0) nonMulTen.add(arr[i]);
		    
		    else multOfTen.add(arr[i]);
		}
		System.out.println(nonMulTen.get(n));
		sc.close();
	}
}
