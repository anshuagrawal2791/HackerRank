import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * Created by anshu on 11/11/16.
 */
public class sudoku {

    static int N=9,r,c;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] a = {{0,0,0,8,3,0,0,1,0},
                {0,1,2,0,9,6,7,8,3},
                {0,0,8,0,0,2,0,4,0},
                {8,0,9,0,6,3,0,0,1},
                {0,0,7,9,5,1,8,2,6},
                {6,0,1,0,8,0,3,0,0},
                {0,8,0,6,0,9,0,0,0},
                {7,0,4,3,2,8,1,6,0},
                {0,0,0,0,4,5,0,0,8}};
//        int [][] a = new int[9][9];
//        for(int i=0;i<9;i++){
//            for(int j=0;j<9;j++){
//                a[i][j]=scan.nextInt();
//            }
//        }

        System.out.print(solve(a));
        printsudoku(a);
    }

    private static boolean solve(int[][] a) {

        int row,col;
        if(!check(a)){

            return true;

        }
        row=r;
        col=c;

        for (int num = 1; num <= 9; num++)
        {
            // if looks promising
            if (isSafe(a, row, col, num))
            {
                // make tentative assignment
                a[row][col] = num;

                // return, if success, yay!
                if (solve(a))
                    return true;

                // failure, unmake & try again
                a[row][col] = 0;
            }
        }



        return false;
    }

    private static boolean isSafe(int[][] grid, int row, int col, int num) {
        return !UsedInRow(grid, row, num) &&
                !UsedInCol(grid, col, num) &&
                !UsedInBox(grid, row - row%3 , col - col%3, num);
    }

    private static boolean UsedInRow(int[][] grid, int row, int num) {
        for (int col = 0; col < N; col++)
            if (grid[row][col] == num)
                return true;
        return false;
    }
    static boolean UsedInCol(int grid[][], int col, int num)
    {
        for (int row = 0; row < N; row++)
            if (grid[row][col] == num)
                return true;
        return false;
    }
    static boolean UsedInBox(int grid[][], int boxStartRow, int boxStartCol, int num)
    {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (grid[row+boxStartRow][col+boxStartCol] == num)
                    return true;
        return false;
    }


    private static void printsudoku(int [][] grid) {
        for (int row = 0; row < N; row++)
        {
            for (int col = 0; col < N; col++)
                System.out.printf("%2d", grid[row][col]);
            System.out.print("\n");
        }
    }

    static boolean check(int grid[][])
    {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (grid[i][j] == 0)
                {
                    r=i;
                    c=j;
                    return true;
                }
        return false;
    }
}
