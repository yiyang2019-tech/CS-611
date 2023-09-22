package pk1;

public class ocrule extends rule{
	private int wincondition;
	public ocrule(int wc){
		this.istie=false;
		this.win=false;
		this.wincondition=wc;
	}
	//brute force scan
	public String ocwinner(board b) {
		int h=b.getheight();
		int w=b.getwidth();
		for(int i=0;i<=h-1;i++) {
			for(int j=0;j<=w-1;j++) {
				if(b.check_column(this.wincondition, i, j)||b.check_main_diagonal(this.wincondition, i, j)
				 ||b.check_row(this.wincondition, i, j)||b.check_secondary_diagonal(this.wincondition, i, j)) {
					if(b.get_element(i, j).equals("O")) {
					this.win=true;
					return b.get_element(i, j);
					}
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
