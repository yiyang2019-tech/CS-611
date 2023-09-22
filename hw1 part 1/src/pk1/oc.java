package pk1;

public class oc extends game{
	private menu ocmenu;
	private board b;
	private int turn;
	private ocrule rl;
	private Team t;
	public oc() {
		this.ocmenu= new menu("order and chaos","order and chaos");
		this.turn =0;
	}
	public void start() {
		this.ocmenu.printout();
		int pl = this.ocmenu.input_pl_size();
		int w = this.ocmenu.input_h_size();
		int h = this.ocmenu.input_w_size();
		int wc = this.ocmenu.input_wincondition();
		this.rl = new ocrule(wc);
		this.b=new board(w,h);
		this.t = new Team(2,pl);
		for(int i=0;i<pl;i++) {
			if(i%2==0) {
				player p = new player("O",i);
				t.addnewpl(p);
				this.ocmenu.printnewteam(i, "O");
			}
			else {
				player p = new player("X",i);
				t.addnewpl(p);
				this.ocmenu.printnewteam(i, "X");
			}
		}
		this.b.print_grid();
		int currentplayer=0;
		while(true) {
			//print turn
			
			System.out.println("Turn: "+ this.turn);
			System.out.println("Player "+currentplayer%pl+" using : "+t.get_player(currentplayer%2)+" Move");
			while(true) {
			int x= ocmenu.input_x();
			int y= ocmenu.input_y();
				if(t.move(currentplayer%2, x, y, b)) {
					break;
				}
			}
			b.print_grid();
			if(!this.rl.ocwinner(b).equals("NA")) {
				this.t.score(currentplayer%2);
				System.out.println("Game over!");
				System.out.println("Order wins");
				if (ocmenu.tryagain()) {
					System.out.println("Restarting game!");
					currentplayer=0;
					this.turn=0;
					this.b=new board(w,h);
					continue;
				}
				else {
					System.out.println("Team 0: Order");
					System.out.println("Team 1: Chaos");
					t.print_scoreboard();
					System.out.println("Thank you for playing!");
					break;
				}
				
			}
			if(this.b.isfull()) {
				System.out.println("Chaos wins!");
				if (ocmenu.tryagain()) {
					System.out.println("Restarting game!");
					currentplayer=0;
					this.turn=0;
					this.b=new board(w,h);
					continue;
				}
				else {
					System.out.println("Team 0: Order");
					System.out.println("Team 1: Chaos");
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
		oc t = new oc();
		t.start();
	}
}
