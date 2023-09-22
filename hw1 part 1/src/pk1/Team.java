package pk1;

import java.util.ArrayList;

public class Team {
	private ArrayList<Integer> scoreboard;
	private int teamnumber;

	private int numplayer;
	private ArrayList<player> tm;
	public Team(int n,int np) {
		this.teamnumber=n;
		this.numplayer=np;
		scoreboard=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++) {
			scoreboard.add(0);
		}
		tm=new ArrayList<player>(np);
	}
	public int gettn() {
		return this.teamnumber;
	}
	public int getnp() {
		return this.numplayer;
	}
	public void addnewpl(player p) {
		this.tm.add(p);
	}
	public String get_player(int index) {
		return this.tm.get(index).getside();
	}
	public void score(int index) {
		this.scoreboard.set(index, this.scoreboard.get(index)+1);
	}
	public void print_scoreboard() {
		for(int i=0;i<this.teamnumber;i++) {
			System.out.println("Team "+ i+ " current score: "+ this.scoreboard.get(i));
		}
	}
	public boolean move(int index,int x,int y,board b) {

		return this.tm.get(index).move(b, x, y);
	}
	public static void main(String[] args) {
		Team t=new Team(2,2);
		t.score(0);
		t.score(1);
		t.print_scoreboard();
	}
}
