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
		
		arr2D = new String[5][4];
		pic = new String[5][4];
		for(int row =0; row < arr2D.length; row++){
			for(int col =0; col<arr2D[row].length; col++){
				arr2D[row][col] = "("+row+","+col+")";
			}
		}
		
		i=2;
		j=3;
		in = new Scanner(System.in);
		startExploring();
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
	public static void printPic(String[][] arr){
		for(int i =0; i<arr.length;i++){
			for(int j=0; j <arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
