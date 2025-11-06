package leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */
public class ValidSudoku
{
    public static void main(String[] args)
    {
        char[][] matrix = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                            { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                            { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                            { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                            { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                            { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        int[][] grid = changeToInt(matrix);

//        for (int i = 0; i < 9; i++) {
//            int value = Character.getNumericValue(grid[i][i]);
//            System.out.println(value);
//            isValidRow(i,grid);
//        }

        print(grid);
    }

    private static void print(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" "+ matrix[i][j] +" ");
            }
            System.out.println("\n");
        }
    }

    private static int[][] changeToInt(char matrix[][])
    {
        int[][] grid = new int[9][9];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int value = Character.getNumericValue(matrix[i][j]);
                if (value < 0) {
                    value = 0;
                }
                grid[i][j] = value;
            }
        }
        return grid;
    }

    private static boolean isValidRow(int row, int[][] matrix)
    {
        int temp[] = matrix[row];
        Set<Integer> set = new HashSet<>();
        for (int value : temp) {
            if (value < 0 || value > 9) {
                System.out.println("Invalid value");
                return false;
            }
            //Checking for repeated values.
            else if (value != 0) {
                if (set.add(value) == false) {
                    return false;
                }
            }
        }
        return true;
    }
}
