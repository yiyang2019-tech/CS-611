package pk1;

import java.util.ArrayList;

public class scoreboard {
	private ArrayList<Integer> scoreboard;
	private int tn;
	public scoreboard(int tn) {
		scoreboard=new ArrayList<Integer>(tn);
		for(int i=0;i<tn;i++) {
			scoreboard.add(0);
		}
	}
	public void score(int index) {
		this.scoreboard.set(index, this.scoreboard.get(index)+1);
	}
	public void print_scoreboard() {
		for(int i=0;i<this.tn;i++) {
			System.out.println("Team "+ i+ " current score: "+ this.scoreboard.get(i));
		}
	}
}
