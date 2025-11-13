public class arrayProblem {
    //we have array [4,10,7,5,8,6]
    //result should be [10,-1,8,8,-1,-1]
    //at the end find total
    //my logic: 
    //traverse and if we get a[i] < a[i+1] then push it into stack
    //if this codition fails it should push(-1 at a[j])
    
    public static void main(String[] args) {
        int[] arr = {4, 10, 7, 5, 8, 6};
        int[] result = new int[arr.length];
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            result[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
            total += (result[i] != -1 ? result[i] : 0);
        }

        System.out.print("Result: ");
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("\nTotal: " + total);
    }
}


