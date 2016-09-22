package datatypes;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;
	static String user;
	static int lineCount;
	
	public static void main(String[] args){
		createAScanner();
		lineCount=0;
		demonstrateStringMethods();
		promptName();
		talkForever();
		
	}
	
	public static void promptName(){
		print("Hello, human! I am a "
				+"board covered with "
				+"semiconductors and \n"
				+"other such electronic components. "
				+"What is your name?");
				user=input.nextLine();
				print("Awesome! I will call you "+user+ " until you terminate me.");
	}
	
	public static void talkForever(){
		while(true){
			promptInput();
		}
	}

	public static void promptInput(){
		print("Try inputing a String!");
		String userInput = input.nextLine();
		print(userInput);
	}
	
	public static void print(String s){
		lineCount++;
		System.out.println("Line #"+lineCount+":" +s);
	}
	
	public static void createAScanner() {
		input=new Scanner(System.in);
	}
	
	public static void demonstrateStringMethods(){
			//String text= new String("Hello World";)
			String text1= "Hello World";
			String text2= "Hello ";
			String text3= "World";
			
			if (text1.equals( text2+text3)){ //not (text1 == text3) 
			System.out.println("These strings are equal.");	
			}
			
			System.out.println(text1);
			System.out.println(text2 + text3);
			
			String word1= "Aardvark";
			String word2="ZZZ";
			if (word1.compareTo(word2)<0){
			System.out.println("Word1 is before word2," + " lexicongraphically.");	
				
			}
			
		}
		
	}

