package info.learn.general;

import java.util.Scanner;

public class QueenAttack {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int rq = scan.nextInt() - 1;
		int cq = scan.nextInt() - 1;
		
		int[][] obstacles = new int[k][2];
		for(int i=0;i<k;i++) {
			for(int j=0;i<2;j++) {
				obstacles[i][j] = scan.nextInt() - 1;				
			}
		}
		
		int resultCount = queenCanAttack(n,k,rq,cq,obstacles);
		System.out.println(resultCount);
		scan.close();
	}

	private static int queenCanAttack(int n, int k, int rq, int cq, int[][] obstacles) {
		int[][] chessBoard = new int[n][n];
		//Adding 1 at queen's position
		chessBoard[rq][cq] = 1;
		//Adding -1 at obstacles
		for(int i=0;i<k;i++) {
			int row = obstacles[i][0];
			int col = obstacles[i][1];
			chessBoard[row][col] = -1;
		}
		
		int count = 0;
		
		//Top - bottom
		for(int i=rq+1;i<n;i++) {
			if(chessBoard[i][cq] == -1) {
				break;
			}
			count ++;
		}
		
		//Bottom - top
		for(int i=rq-1;i>=0;i--) {
			if(chessBoard[i][cq] == -1) {
				break;
			}
			count ++;
		}
		
		//left - right
		for(int i=cq-1;i>=0;i--) {
			if(chessBoard[rq][i] == -1) {
				break;
			}
			count ++;
		}
		
		//right - left
		for(int i=cq+1;i<n;i++) {
			if(chessBoard[rq][i] == -1) {
				break;
			}
			count ++;
		}
		
		int j = cq -1;
		//diagonal left top
		for(int i=rq-1;i>=0 && j >= 0;i--) {			   
			if(chessBoard[i][j] == -1) {
				break;
			}
			j --;
			count ++;
		}
		
		j = cq -1;
		//diagonal left bottom
		for(int i=rq+1;i<n && j >= 0 ;i++) {
			if(chessBoard[i][j] == -1) {
				break;
			}
			j--;
			count ++;
		}
		
		j = cq + 1;
		//diagonal right top
		for(int i=rq-1;i>=0 && j < n;i--) {
			if(chessBoard[i][j] == -1) {
					break;
			}	
			j ++;
			count ++;
		}
		j = cq + 1;
		//diagonal right bottom
		for(int i=rq+1;i<n && j < n ;i++) {
				if(chessBoard[i][j] == -1) {
					break;
				}	
				j++;
			count ++;
		}
		
		return count;
	}

}
