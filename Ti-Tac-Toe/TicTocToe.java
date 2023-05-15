package com.firstjava;
import java.util.Scanner;

//Create a simple tictactoe game of two users. Declare the winner as soon as any player wins.
public class TicTocToe {
static //	0- 2
//	x- 1
//	empty- 0
	int n=6;
	static int [][]board =new int[n][n];
	static Scanner sc =new Scanner(System.in);
	static Integer player=1;
	static Integer winner =0;
	public static void main(String[] args) {
		while (winner==0) {
			System.out.println("Player "+player+",gives your next move");
	System.out.println("Input the next move row");
	int row=sc.nextInt();
	System.out.println("Input the next move column");
	int col= sc.nextInt();
	if (board[row][col]==0)
	board[row][col]= player;
	else {
		System.out.println("The place is already marked, choose another position");
		continue;
	}
	printBoard(board);
	int rowScore=0,colScore=0,diagScore=0,crossDiagScore=0;
//	check the winner
	for(int i=0;i<board[0].length;i++) {
		if(board[row][i]==player)
		rowScore++;
	}
	for(int i=0;i<board.length;i++) {
		if(board[i][col]==player)
		colScore++;
	}
	for(int i=0,j=0;i<board.length && j<board[0].length;i++,j++) {
		if(board[i][j]==player)
		diagScore++;
	}
	for(int i=0 , j=board[0].length-1;i<board.length && j>=0;i++,j--) {
		if(board[i][j]==player)
		crossDiagScore++;
	}
	if (rowScore==3 || colScore==3 || diagScore==3 || crossDiagScore==3) {
		winner=player;
	System.out.println("The Game has ended . The winner is "+player);
	}
		else {
		if (player == 1)
			player = 2;
		else
			player =1;
	}
	
	}
	}
	
	private static void printBoard(int [][] board) {
		for (int i = 0; i < board.length; i++) {
		for	(int j=0; j< board[0].length; j++) {
			System.out.print(board[i][j] +" ");
		}
		System.out.println("  ");
			
		}
			
	
	}	
		
		
}	

