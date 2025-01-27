public class Main {
    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        boolean[][] board = {
            {true, false, false, false, true, false},
            {false, false, false, false, true, true},
            {false, true, true, false, false, false},
            {false, true, false, false, true, false},
            {false, true, false, true, false, false},
            {false, false, false, false, false, false}
        };

        System.out.println();
        System.out.println();
        System.out.println();
        print2DArray(board);
        System.out.println();
        print2DArray(gameOfLife.findLivingCellLocations(board));
        System.out.println();
        System.out.println();
        print2DArray(gameOfLife.createGeneration(board));
        System.out.println();
        print2DArray(gameOfLife.findLivingCellLocations(gameOfLife.createGeneration(board)));
        System.out.println();
        System.out.println();
        print2DArray(gameOfLife.createGeneration(gameOfLife.createGeneration(board)));
        System.out.println();
        print2DArray(gameOfLife.findLivingCellLocations(gameOfLife.createGeneration(gameOfLife.createGeneration(board))));
        
    }

    public static void print2DArray(boolean[][] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == true){
                    System.out.print("X ");
                }else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }

    public static void print2DArray(int[][] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
