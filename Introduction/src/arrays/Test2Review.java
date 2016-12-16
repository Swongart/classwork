package arrays;

import java.lang.reflect.Array;

public class Test2Review {
	
public static boolean grid[][];

	public static void main(String[] args){
		grid=new boolean[5][5];
		printGrid(grid);	
		buttonClick(3,3);
		printGrid(grid);	
		buttonClick(3,3);
	}
	public static void switchRow(boolean[] row, int x){
//		for(int i=-1;i<2;i++){
//			if(x+1>=0 &&x+1<row.length){
//				row[x+i]=!row[x+1];
//			}
//		}
		if(x>=0 && x<row.length){
			for(int i=-1;i<2;i++){
				if(x+1>=0 &&x+1<row.length){
					row[x+i]=!row[x+1];
				}
			}
			
		}
	}
	public static void switchColumn(boolean grid[][], int r, int c){
		switchIfValid(grid, r-1, c);
		switchIfValid(grid, r+1, c);
	}
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if(r>=0 && r<grid.length && c>=0 && c<grid[r].length){
			grid[r][c]=!grid[r][c];
		}
	}
	private static void buttonClick(int r, int c) {
		if(r>=0 && r<grid.length){//not on rubric
			switchRow(grid[r],c);
		}
		switchColumn(grid, r,c);//one point
		//Check to see if any lights are on
		boolean win=true;
		for(int i=0;i<grid.length;i++){
			for(int j=0;i<grid[i].length;j++){
				//1 of 2 points
				if(grid[i][j]){
					win=false;
					break;
				}
					
			}
		}
		if(win)System.out.println("You have solved the puzzle");
	}
	public static void printGrid(boolean[][] grid){
		for(boolean[]row:grid){
			for(boolean b: row){
				if(b)System.out.print("O");
				else System.out.print("X");
			}
			System.out.print("\n");
			
		}
		System.out.println("----------------");
	}
}




