public class Main {
    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        boolean[][] board = {
            {false, false, false, false, false, false},
            {false, true, true, false, false, false},
            {false, true, true, false, false, false},
            {false, false, false, false, false, false},
            {false, false, false, false, false, false},
            {false, false, false, false, false, false}
        }
        print2DArray(gameOfLife.createGeneration(board));

    }

    public static void print2DArray(boolean[][] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
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
