package pk1;



public class game {
	private boolean is_over;
	private menu gmenu;
	private String gm;
	public game() {
		this.is_over=false;
		this.gmenu= new menu("","");
	}
	public void initialize() {
		String s=this.gmenu.inquiry();
		this.gmenu.set_status(s);
		this.gmenu.printout();
		this.gm=s;
		
	}
	public void start() {
		if(this.gm.equals("t")) {
			tictactoe t = new tictactoe();
			t.start();
		}
		if(this.gm.equals("o")) {
			oc t = new oc();
			t.start();
		}
	}
	
	public static void main(String[] args) {
		game g= new game();
		g.initialize();
	}
}
