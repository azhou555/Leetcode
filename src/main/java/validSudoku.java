public class validSudoku {
    public boolean isValidSudoku(char[][] board) {
        // check row and column
        for(int i = 0; i < 9; i++){
            int[] used = new int[9];
            for(int j = 0; j < 9 ; j ++){
                if(board[i][j] == 46){continue;}
                if(used[board[i][j]-48-1] == 1){
                    return false;
                }
                else{
                    used[board[i][j]-48-1] = 1;
                }
            }
        }
        for(int i = 0; i < 9; i++){
            int[] used = new int[9];
            for(int j = 0; j < 9 ; j ++){
                if(board[j][i] == 46){continue;}
                if(used[board[j][i]-48-1] == 1){
                    return false;
                }
                else{
                    used[board[j][i]-48-1] = 1;
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int[] used = new int[9];    
                for(int k = 0; k < 3; k++){
                    for(int l = 0; l < 3 ; l++){
                        if(board[3*i + k][3*j + l] == 46){continue;}
                        if(used[board[3*i+k][3*j+l]-48-1] == 1){
                            return false;                            
                        }
                        else{
                            used[board[3*i+k][3*j+l]-48-1] = 1;
                        }
                    }
                }
            }
        }
        return true;
    }
}
