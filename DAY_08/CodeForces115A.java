package DAY_08;

import java.util.Scanner;

public class CodeForces115A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[n];


        for(int i=0;i<n;i++){
            score[i] = sc.nextInt();
        }

        int amazingScore = 0;
        int maxScore = score[0];
        int minScore = score[0];

        for(int i=0;i<n;i++){
            if(score[i]>maxScore){
                amazingScore++;
                maxScore = score[i];
            }else if(score[i]<minScore){
                amazingScore++;
                minScore = score[i];
            }
        }
        System.out.println(amazingScore);
        sc.close();
    }
}
