package pk1;

public class rule {
	boolean istie;
	boolean win;
	public rule() {
		this.istie=false;
		this.win=false;
	}
	
	public boolean isgameover() {
		if(istie||win) {
			return true;
		}
		return false;
	}
	
	public boolean getwin() {
		return this.win;
	}
	public boolean gettie() {
		return this.istie;
	}
	
	
}
