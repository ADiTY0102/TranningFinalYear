public class ValidSudokuMedium {
    public static boolean checkvalidSudoku(char board[][]) {
        /*
         * rows[9][9] → to track digits seen in each row.
         * cols[9][9] → to track digits seen in each column.
         * boxes[9][9] → to track digits seen in each 3×3 sub-box.
         * 
         * If the cell is empty ('.'), skip it.
         * Otherwise, convert the character digit into an integer index
         * num = board[i][j] - '1' (so '1' → 0, '9' → 8).
         * Compute the box index: boxIndex = (i / 3) * 3 + (j / 3) (this uniquely
         * identifies each of the 9 sub-boxes).
         */

        boolean [][] rows = new boolean[9][9];
        boolean [][] colums = new boolean[9][9];
        boolean [][] boxes = new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '1';
                    int index = (i/3) *3+ (j/3);
                    if(rows[i][num] || colums[num][j] || boxes[index][num]){
                        return false;
                    }
                    rows[i][num] = colums[num][j] = boxes[index][num] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char board[][] = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        boolean result = checkvalidSudoku(board);
        System.out.println(result);
    }
}
