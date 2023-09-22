package pk1;

import java.util.Scanner;

public class menu {
	String name;
	String status;
	public menu(String c,String st) {
		this.name=c;
		this.status=st;
	}
	public void set_status(String g) {
		if( g.equals("t")) {
				
			this.status="tic-tac-toe";
		}
		else {
			this.status="Order and Chaos";
		}
	}
	
	public void printout() {
		System.out.println("welcome to "+this.status+"!");
		
	}
	public void printnewteam(int number, String side) {
		System.out.println("player: "+number+" added to team: "+side+"!");		
	}
	public String inquiry() {
		String g;
		Scanner myObj;
		while(true) {
		System.out.println("please choose which game to play:");
	    myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter t for tic-tac-toe or o for Order and Chaos:");

	    g = myObj.nextLine();  // Read user input

	    if(g.equals("t")) {
	    	break;
	    }
	    if(g.equals("o")) {
	    	break;
	    }
	    System.out.println("invalid game selection!"); 
		}
	    System.out.println("The game you select is: " + g);  // Output user input
	    return g;
	}
	
	
	public static boolean isStringInt(String s)
	{
	    try
	    {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
	}
	
	public int input_x() {
		String g;
		Scanner myObj;
		while(true) {
		System.out.println("please select your x coordinate (index start from zero)");
	    myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter here:");

	    g = myObj.nextLine();  // Read user input

	    if(isStringInt(g)) {
	    	if(Integer.parseInt(g)>=0) {
	    		break;
	    	}
	    }
	    System.out.println("invalid x!"); 
		}
	    return Integer.parseInt(g);
	}
	public int input_y() {
		String g;
		Scanner myObj;
		while(true) {
		System.out.println("please select your y coordinate (index start from zero)");
	    myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter here:");

	    g = myObj.nextLine();  // Read user input

	    if(isStringInt(g)) {
	    	if(Integer.parseInt(g)>=0) {
	    		break;
	    	}
	    }
	    System.out.println("invalid y!"); 
		}
	    return Integer.parseInt(g);
	}
	public boolean tryagain() {
		String g;
		Scanner myObj;
		while(true) {
		System.out.println("Try again? [y/n]");
	    myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter here:");

	    g = myObj.nextLine();  // Read user input
	    if(g.equals("y")||g.equals("n")) {
	    	break;
	    }
	    System.out.println("invalid y!"); 
	    }
	    if(g.equals("y")) {
	    	return true;
	    }
		
	    return false;
	}

	public int input_w_size() {
		String g;
		Scanner myObj;
		while(true) {
		System.out.println("please select the width of the board");
	    myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter here:");

	    g = myObj.nextLine();  // Read user input

	    if(isStringInt(g)) {
	    	if(Integer.parseInt(g)>0) {
	    		break;
	    	}
	    }
	    System.out.println("invalid width!"); 
		}
	    System.out.println("Board Width is: " + g);  // Output user input
	    return Integer.parseInt(g);
	}

	public int input_wincondition() {
		String g;
		Scanner myObj;
		while(true) {
		System.out.println("please select the winning condition:");
	    myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter here:");

	    g = myObj.nextLine();  // Read user input

	    if(isStringInt(g)) {
	    	if(Integer.parseInt(g)>0) {
	    		break;
	    	}
	    }
	    System.out.println("invalid size!"); 
		}
	    System.out.println("winning condition is: " + g);  // Output user input
	    return Integer.parseInt(g);
	}	
	
	
	
	
	
	
	
	public int input_h_size() {
		String g;
		Scanner myObj;
		while(true) {
		System.out.println("please select the height of the board");
	    myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter here:");

	    g = myObj.nextLine();  // Read user input

	    if(isStringInt(g)) {
	    	if(Integer.parseInt(g)>0) {
	    		break;
	    	}
	    }
	    System.out.println("invalid height!"); 
		}
	    System.out.println("Board Height is: " + g);  // Output user input
	    return Integer.parseInt(g);
	}
	
	public int input_pl_size() {
		String g;
		Scanner myObj;
		while(true) {
		System.out.println("please select the number of player for the game");
	    myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter here:");

	    g = myObj.nextLine();  // Read user input

	    if(isStringInt(g)) {
	    	if(Integer.parseInt(g)>0) {
	    		break;
	    	}
	    }
	    System.out.println("invalid input!"); 
		}
	    System.out.println("number of player is: " + g);  // Output user input
	    return Integer.parseInt(g);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		menu m= new menu("tictactoe","tictactoe");
		System.out.print(isStringInt(""));
	}
	
}
