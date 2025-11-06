package leetcode.easy.array;

public class MatrixMazeProblem
{
    public static void main(String[] args)
    {
        char[][] matrix = { { '<', '>', '.', '.' },
                            { '.', '>', '.', '^' },
                            { '.', '.', 'X', '.' },
                            { 'A', '.', '.', '.' },
                            { '.', '.', '.', '.' } };

        String[] B = { "...Xv", "AX..^", ".XX.." };

        String[] data = {"X.....>","..v..X.",".>..X..","A......"};
        System.out.println(solution(B));
    }

    private static boolean solution(String[] B)
    {

        int row=B.length;
        int column=B[0].length();

        int array[][]=new int[row][column];

        for(int i=0;i<row;i++){
            char charArray[]=B[i].toCharArray();
            for(int j=0;j<charArray.length;j++){
                char ch=charArray[j];
                if(ch=='.')
                    array[i][j]=0;
                else if(ch=='X'){
                    array[i][j]=-1;
                }else if (ch=='v' || ch=='^' || ch=='<' || ch=='>'){
                    array=overrideArray(array,i,j,ch,row,column);
                }
            }
        }

print(array);

        return true;
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

    public static int[][] overrideArray(int array[][],int start,int end,char ch,int row,int col){

        switch(ch){

        case 'v':
            for(int i=start;i<row;i++){
                array[i][end]=-1;
            }
            break;
        case '^':
            for(int i=0;i<start;i++){
                array[i][end]=-1;
            }
            break;
        case '<':
            for(int i=0;i<end;i++){
                array[start][i]=-1;
            }
            break;
        case '>':
            for(int i=end;i<col;i++){
                array[start][i]=-1;
            }
            break;
        }
        return array;

    }
}
