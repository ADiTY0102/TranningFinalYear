import java.util.HashSet;
import java.util.Set;

public class ValidSudokuEasy {
    public static boolean isValidSudoku(int arr[][]){
        int n = arr.length;
        for(int i=0;i<n;++i){
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            for(int j=0;j<n;++j){
                if(!row.add(arr[i][j]) || !col.add(arr[j][i])){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,1,1},{3,1,2},{2,3,1}
        };
        System.out.println(isValidSudoku(arr));
    }
}
