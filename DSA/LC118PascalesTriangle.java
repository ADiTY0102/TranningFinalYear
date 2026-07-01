import java.util.ArrayList;
import java.util.List;

public class LC118PascalesTriangle {
    public static List<List<Integer>> generateTraingle(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        // 0 numRows
        if(numRows == 0)
            return result;
        //1st row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(numRows == 1) return result;

        for(int i=1;i<numRows;i++){
            List<Integer> prevRow = result.get(i-1);

            //create new row => iterating row:
            List<Integer> row = new ArrayList<>();
            row.add(1); // starting element;
            for(int j=0;j<i-1;j++){
                row.add(prevRow.get(j) + prevRow.get(j+1));
            }
            row.add(1);  //last element

            result.add(row);
        }

        return result;

    }
    public static void main(String[] args) {
        int numRows = 6;
        System.out.println(generateTraingle(numRows));
    }
}
