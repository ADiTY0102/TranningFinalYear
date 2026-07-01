public class WavyArray {
    public static void main(String[] args) {
        int num[] = {10,90,49,2,1,5,23};
        for(int i=0;i<num.length-1;i++){
            if(i%2 == 0){
                if(num[i] < num[i+1] ){
                   int temp = num[i];
                   num[i] = num[i+1];
                   num[i+1] = temp;
                   i++;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
            System.out.println();
        }
    }
}
