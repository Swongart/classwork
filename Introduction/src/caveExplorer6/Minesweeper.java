package caveExplorer6;


public class Minesweeper {

	public static void main(String[] args) {
		boolean[][] mines = new boolean[6][6];
		createMines(mines, 10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field, mines);
		TwoDArrayIntro.printPic(field);
	}

	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[0].length; col++){
				if(mines[row][col]){
					field[row][col] = "X";
				}else{
					field[row][col] = countAdjacent(mines, row, col);
				}
			}
		}
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		int count = 0;
		//r and c represent coordinates of element we are providing a String for
		
		//loop through row above to row below
//		for(int row = r-1; row <= r+1; row++){
//			//loop through col left to col right
//			for(int col = c-1; col <= c+1; col++){
//				//exclude this element when counting
//				if(row != r && col != c){
//					if(row >= 0 && row < mines.length && col >= 0 && col < mines[0].length){
//						
//					}
//				}
//			}
//		}
		//this method only checks elements in the [][]
		//so it is not necessary to verify they are valid
		for(int row = 0; row < mines.length; row++){
			for(int col = 0; col < mines[row].length; col++){
				//check taxi cab distance
				if(Math.abs(row-r)+Math.abs(col-c) == 1 && 
						//check if true
						mines[row][col]){
					count++;
				}
			}
		}
		//this method is helpful when you want to be
		//very specific
		
		//above
		count+=validAndTrue(mines, r-1, c);
		//below
		count+=validAndTrue(mines, r+1, c);
		//right
		count+=validAndTrue(mines, r, c+1);
		//left
		count+=validAndTrue(mines, r, c-1);
		
		return count + "";
	}

	private static int validAndTrue(boolean[][] mines, int i, int j) {
		//checks valid
		if(i >= 0 && i < mines.length && j >= 0 && j < mines[i].length &&
		//checks if true	
			mines[i][j]){
			return 1;
		}else{
			return 0;
		}
		
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		while(numberOfMines > 0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			if(mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
	}

}
