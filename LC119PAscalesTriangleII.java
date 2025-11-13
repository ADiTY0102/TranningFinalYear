import java.util.ArrayList;
import java.util.List;
public class LC119PAscalesTriangleII{
    public static List<Integer> getPascleTriangleRow(int index){
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i <= index; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < i; j++){
                row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            if(i > 0) row.add(1);
            result.add(row);
        }
        return result.get(index);
    }
    public static void main(String[] args) {
        int index = 3;
        List<Integer> row = getPascleTriangleRow(index);
        System.out.println(row);
    }
}