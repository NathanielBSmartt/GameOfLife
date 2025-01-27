public class GameOfLife{

    public static boolean[][] createGnereation(boolean[][] board){
        int numRows = board.length;
        int numCols = board[0].length;
        int numLivingCells = 0;

        boolean[][] nextBoard = new boolean[numRows][numCols];


        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numCols; c++){

                //Checking neighboring cells to count up the number of living cells around the current cell

                if(board[r][c] == true){ // Living Cell Check
                    if(r < numRows && board[r+1][c] == true){
                        numLivingCells++;
                    }
                    if(r > 0 && board[r-1][c] == true){
                        numLivingCells++;
                    }
                    if(c > 0 && board[r][c-1] == true){
                        numLivingCells++;
                    }
                    if(c < numCols && board[r][c+1] == true){
                        numLivingCells++;
                    }
                    if(r > 0 && c > 0 && board[r-1][c-1] == true){
                        numLivingCells++;
                    }
                    if(r < numRows && c < numCols && board[r+1][c+1] == true){
                        numLivingCells++;
                    }
                    if(r > 0 && c < numCols && board[r-1][c+1] == true){
                        numLivingCells++;
                    }
                    if(r < numRows && c > 0 && board[r+1][c-1] == true){
                        numLivingCells++;
                    }
                
                    //Based on the number of living cell neighbors, determine the next state of the cell

                    if(numLivingCells == 2 || numLivingCells == 3){
                        newBoard[r][c] = true;
                        numLivingCells = 0;
                    }else{
                        newBoard[r][c] = false;
                        numLivingCells = 0;
                    }
                }else{ // Dead Cell Check
                    if(r < numRows && board[r+1][c] == true){
                        numLivingCells++;
                    }
                    if(r > 0 && board[r-1][c] == true){
                        numLivingCells++;
                    }
                    if(c > 0 && board[r][c-1] == true){
                        numLivingCells++;
                    }
                    if(c < numCols && board[r][c+1] == true){
                        numLivingCells++;
                    }
                    if(r > 0 && c > 0 && board[r-1][c-1] == true){
                        numLivingCells++;
                    }
                    if(r < numRows && c < numCols && board[r+1][c+1] == true){
                        numLivingCells++;
                    }
                    if(r > 0 && c < numCols && board[r-1][c+1] == true){
                        numLivingCells++;
                    }
                    if(r < numRows && c > 0 && board[r+1][c-1] == true){
                        numLivingCells++;
                    }



                    if(numLivingCells == 3){
                        newBoard[r][c] = true;
                        numLivingCells = 0;
                    }else{
                        newBoard[r][c] = false;
                        numLivingCells = 0;
                    }
                }
            }
        }

        return newBoard;
    }
    
    public static int[][] findLivingCellLocations(boolean[][] board){

        int numRows = board.length;
        int numCols = board[0].length;
        int numLivingCells = 0;
        int[][] livingCellLocations;

        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numCols; c++){
                if(board[r][c] == true){
                    numLivingCells++;
                }
            }
        }

        livingCellLocations = new int[numLivingCells][2];
        numLivingCells = 0;

        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numCols; c++){
                if(board[r][c] == true){
                    livingCellLocations[numLivingCells][0] = r;
                    livingCellLocations[numLivingCells][1] = c;
                    numLivingCells++;
                }
            }
        }
        return livingCellLocations;
    }
    
}
    