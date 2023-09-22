package pk1;

public class player {
	private String side;
	private int num;
	
	public player(String s, int n) {
		this.side=s;
		this.num=n;
	}
	public String getside() {
		return this.side;
	}
	public int getnum() {
		return this.num;
	}
	public boolean move(board b,int x,int y) {
		return b.move(x, y, this.side);
	}

}
