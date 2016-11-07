package caveExplorer6;

import java.util.Scanner;

public class Practice { // this moves the x using keys w,a,s,d. Need to create cooresponding grid.
	
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;
	
	public static void main(String[] args){
//		String[][] arr = new String[6][6];
//		makeMap(arr);
		
		arr2D = new String[5][4]; //I want an array of 5 string arrays with a length of 4
				//Looks like this: [String[4]][String[4]][String[4]][String[4]][String[4]]
		pic = new String[5][4];
		for(int row =0; row < arr2D.length; row++){
			for(int col =0; col<arr2D[row].length; col++){
				arr2D[row][col] = "("+row+","+col+")";
			}
		}
		
		i=2;
		j=3; // start in position (2,3)
		in = new Scanner(System.in);
		//startExploring();
		createGrid(6,6);
	}
	private static void createGrid(int row, int col) {
		row = row*4; // create '|' in the rows.
		col = col*2; // create '____' in the columns.
		System.out.print(" "); // make space for '|' in the next line so that __ will not be directly on top of |
		
		int y = 0, x = 0; // since i'm using two loops and they'll be using the same variable. This allows me to use the variables again.
		for(y=0; y < 1; ++y){ // create the first row.
			for(; x < col; ++x){ // traverse through the columns.
				if(x % 2 == 0) System.out.print("____ "); // in every other column, we'll add the top/bottom border.
			}
			System.out.println(" "); // row is finished -> go to next line.
		}
		for(; y <= row; ++y){ // this is the real loop for the body -> Loop through the rows.
			for(x = 0; x <= col; ++x){ // Loop through the columns.
				if(y % 4 == 0){ // for every 4th row:
					if(x % 2 != 0) System.out.print("____"); // if it's an odd column -> we'll add the top/bottom border.
					else System.out.print("|"); // if it's an even column -> we'll add the left/right border.
				}
				else if(x % 2 == 0) System.out.print("|    "); // for every other row && the column is even -> add the left/right border.
			}
			System.out.println(""); // row is finished -> go to next line.
		}
		
	}
	private static void startExploring() {
		while(true){
			
			printPic(pic);
			System.out.println("you are in room"+arr2D[i][j]);
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter w,a,s,d");
				input = in.nextLine();
			}
			for(int row =0; row < pic.length; row++){
				for(int col =0; col<pic[row].length; col++){
					pic[row][col] = " ";
				}
			}
			pic[i][j]="X";
			interpretInput(input.toLowerCase());
		}
		
	}

	private static void interpretInput(String input) {
		int iOrig =i;
		int jOrig =j;
		if(input.equals("w")&& i>0)
			i--;
		else if(input.equals("s")&& i+1<arr2D.length)
			i++;
		else if(input.equals("a")&& j>0)
			j--;
		else if(input.equals("d")&& j+1<arr2D[0].length)
			j++;
		if(iOrig ==i && jOrig ==j){
			System.out.println("You are at the edge of the universe. You can move no further in that direction.");
		}
	}

	private static boolean isValid(String input) {
		String lc = input.toLowerCase();
		String [] keys = {"w","a","s","d"};
		for(String key:keys){
			if(key.equals(lc))
				return true;
		}
		return false;
	}
/*
	public static void makeMap(String[][] arr){
		for(int r =0; r<arr.length;r++){
			for(int c=0; c <arr[0].length;c++){
				System.out.print("|");
			}
		}
		
		for(int r =0; r<arr.length;r+=2){
			for(int c=0; c <arr[0].length;c++){
				System.out.print("__");
			}
		}
	}
*/	
	/*
	 public static void print(int col,int row, int posX, int posY) {
		for (int j = 0; j != col; j++) {
			System.out.print("____");
		}
		System.out.println();

		for (int i = 0; i != row; i++) {
			for (int j = 3; j > 0; j--) {
				for (int k = 0; k != col; k++) {
					if (j == 1) {
						System.out.print("|___");
					} else {
						if (j == 2 && i == posX && k == posY) {
							System.out.print("| X ");
						} else {
							System.out.print("|   ");
						}
					}
				}
				System.out.println("|");
			}
		}
	}
	*/
	
	public static void printPic(String[][] arr){
		for(int i =0; i<arr.length;i++){
			for(int j=0; j <arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
