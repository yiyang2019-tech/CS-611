package pk1;

public class tictactoe extends game{
	private menu t3menu;
	private board b;
	private int turn;
	private t3rule rl;
	private Team t;
	public tictactoe() {
		this.t3menu= new menu("tictactoe","tictactoe");
		this.turn =0;
	}
	public void start() {
		this.t3menu.printout();
		int pl = this.t3menu.input_pl_size();
		int w = this.t3menu.input_h_size();
		int h = this.t3menu.input_w_size();
		this.rl = new t3rule();
		this.b=new board(w,h);
		this.t = new Team(2,pl);
		for(int i=0;i<pl;i++) {
			if(i%2==0) {
				player p = new player("O",i);
				t.addnewpl(p);
				this.t3menu.printnewteam(i, "O");
			}
			else {
				player p = new player("X",i);
				t.addnewpl(p);
				this.t3menu.printnewteam(i, "X");
			}
		}
		this.b.print_grid();
		int currentplayer=0;
		while(true) {
			//print turn
			
			System.out.println("Turn: "+ this.turn);
			System.out.println("Player "+currentplayer%pl+" using : "+t.get_player(currentplayer%2)+" Move");
			while(true) {
			int x= t3menu.input_x();
			int y= t3menu.input_y();
				if(t.move(currentplayer%2, x, y, b)) {
					break;
				}
			}
			b.print_grid();
			if(!this.rl.t3winner(b).equals("NA")) {
				this.t.score(currentplayer%2);
				System.out.println("Game over!");
				System.out.println("Winner is "+this.t.get_player(currentplayer%pl));
				if (t3menu.tryagain()) {
					System.out.println("Restarting game!");
					currentplayer=0;
					this.turn=0;
					this.b=new board(w,h);
					continue;
				}
				else {
					t.print_scoreboard();
					System.out.println("Thank you for playing!");
					break;
				}
				
			}
			if(this.b.isfull()) {
				System.out.println("Tie!");
				if (t3menu.tryagain()) {
					System.out.println("Restarting game!");
					currentplayer=0;
					this.turn=0;
					this.b=new board(w,h);
					continue;
				}
				else {
					t.print_scoreboard();
					System.out.println("Thank you for playing!");
					break;
				}
			}
			currentplayer+=1;
			this.turn+=1;
		}
		
	}
	public static void main(String[] args) {
		tictactoe t = new tictactoe();
		t.start();
	}
}
