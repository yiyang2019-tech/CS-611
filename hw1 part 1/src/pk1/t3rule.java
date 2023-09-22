package pk1;

public class t3rule extends rule{
	public t3rule(){
		this.istie=false;
		this.win=false;
	}
	
	public String t3winner(board b) {
		int h=b.getheight();
		int w=b.getwidth();
		for(int i=0;i<=h-1;i++) {
			for(int j=0;j<=w-1;j++) {
				if(b.check_column(h, i, j)||b.check_main_diagonal(h, i, j)
				 ||b.check_row(h, i, j)||b.check_secondary_diagonal(h, i, j)) {
					this.win=true;
					return b.get_element(i, j);
				}
			}
		}
		return "NA";
	}
	
	public boolean tie(board b) {
		if(b.isfull() && this.win==false) {
			this.istie=true;
			return true;
		}
		return true;
		
	}

}
