package pk1;
import java.util.ArrayList;

public class board {
	 private int width;
	 private int height;
	 private boolean issquare;
	 private ArrayList<cell> cells = new ArrayList<cell>(10000);
	 public board(int w,int h) {
		 setedge(w,h);
		 fill();
		 if(w==h) {
			 issquare=true;
		 }
	 }
	 public int getheight() {
		 return this.height;
	 }
	 public int getwidth() {
		 return this.width;
	 }
	 private void setedge(int w, int h) {
		 if(w>=0) {
			 this.width=w;
		 }
		 else {
			 this.width=0;
		 }
		 if(h>=0) {
			 this.height=h;
		 }
		 else {
			 this.height=0;
		 }
		 if(this.width==this.height) {
			 this.issquare=true;
		 }
	 }
	 private void fill() {
		 for(int i=0;i<this.height;i++) {
			 for(int j=0;j<this.width;j++) {
				 cell c=new cell(i,j,"_");
				 this.cells.add(c);
			 }
		 }
	 }
	 public String get_element(int x,int y) {
		 return this.cells.get(this.width*y+x).get_content();
	 }
	 public void print_grid() {
		 String line="";
		 String line2="";
		 for(int i=0;i<this.height;i++) {
			 line=new String();
			 line2=new String();
			 for(int j=0;j<this.width;j++) {
				 line2+="--|-";
				 
				 line+=this.get_element(j, i)+" | ";			
				 }
			 System.out.println(line2);
			 System.out.println(line);
			 
		 	}
		 System.out.println(line2);
	 	}
	public boolean check_main_diagonal(int size,int x, int y) {
		int flg=0;
		int flg2=0;
		int itr=y;
		int itr2=x;
		while(true) {
			if(itr+1<this.width&&itr2+1<this.height) {
			if(this.get_element(itr, itr2).equals(this.get_element(itr+1, itr2+1)) && flg==0&&flg2==0) {
				if(!this.get_element(itr, itr2).equals("_")) {
						flg+=1;
						flg2=1;
				}
			}
			if(!this.get_element(itr, itr2).equals(this.get_element(itr+1, itr2+1))) {
				flg=0;
			}
			if (this.get_element(itr, itr2).equals(this.get_element(itr+1, itr2+1)) && flg>0&&flg2==0){
				if(!this.get_element(itr, itr2).equals("_")) {
					flg+=1;
					flg2=1;
				}
			}
			//System.out.print(flg);
			flg2=0;

			
			
			
			if(flg>=size-1) {
				break;
			}
			if(itr>=this.width-2 || itr2>=this.height-2) {
				break;
			}
			itr=itr+1;
			itr2=itr2+1;
			}
			else {
				break;
			}
			
			
		}

		if(flg>=size-1&& flg>0) {
			return true;
		}
		else {
			return false;
		}

	}

	public boolean check_secondary_diagonal(int size,int x, int y) {
		int flg=0;
		int flg2=0;
		int itr=y;
		int itr2=x;
		while(true) {
			if(itr+1<this.width&&itr2-1>=0) {
			//System.out.print(this.get_element(itr, itr2));
			if(this.get_element(itr, itr2).equals(this.get_element(itr+1, itr2-1)) && flg==0&&flg2==0) {
				if(!this.get_element(itr, itr2).equals("_")) {
						flg+=1;
						flg2=1;
				}
			}
			if(!this.get_element(itr, itr2).equals(this.get_element(itr+1, itr2-1))) {
				flg=0;
			}
			if (this.get_element(itr, itr2).equals(this.get_element(itr+1, itr2-1)) && flg>0&&flg2==0){
				if(!this.get_element(itr, itr2).equals("_")) {
					flg+=1;
					flg2=1;
				}
			}

			flg2=0;

			
			
			
			if(flg>=size-1) {
				break;
			}
			itr=itr+1;
			itr2=itr2-1;
			}
			else {
				break;
			}
			
		}

		if(flg>=size-1&& flg>0) {
			return true;
		}
		else {
			return false;
		}

	}
		
	
	
	public boolean check_column(int size,int x, int y) {
		int flg=0;
		int itr=x;
		int itr2=y;
		int flg2=0;
		while(true) {
			
			if(itr+1<this.width) {
			//System.out.print(this.get_element(itr, itr2));
			if(this.get_element(itr, itr2).equals(this.get_element(itr+1, itr2)) && flg==0&&flg2==0) {
				if(!this.get_element(itr, itr2).equals("_")) {
						flg+=1;
						flg2=1;
				}
			}
			if(!this.get_element(itr, itr2).equals(this.get_element(itr+1, itr2))) {
				flg=0;
			}
			if (this.get_element(itr, itr2).equals(this.get_element(itr+1, itr2)) && flg>0&&flg2==0){
				if(!this.get_element(itr, itr2).equals("_")) {
					flg+=1;
					flg2=1;
				}
			}

			flg2=0;

			
			
			
			if(flg>=size-1) {
				break;
			}
			itr=itr+1;

			}
			else {
				break;
			}
			
		}

		if(flg>=size-1&& flg>0) {
			return true;
		}
		else {
			return false;
		}

	}
	
	public boolean isfull() {
		for(int i=0;i<=this.height-1;i++) {
			for(int j=0;j<=this.width-1;j++) {
				if(this.get_element(j, i).equals("_")) {
					return false;
				}
				}
			}
		return true;
	}
	
	public boolean check_row(int size,int x, int y) {
		int flg=0;
		int itr=x;
		int itr2=y;
		int flg2=0;
		while(true) {
			
			if(itr2+1<this.height) {
			//System.out.print(this.get_element(itr, itr2));
			if(this.get_element(itr, itr2).equals(this.get_element(itr, itr2+1)) && flg==0&&flg2==0) {
				if(!this.get_element(itr, itr2).equals("_")) {
						flg+=1;
						flg2=1;
				}
			}
			if(!this.get_element(itr, itr2).equals(this.get_element(itr, itr2+1))) {
				flg=0;
			}
			if (this.get_element(itr, itr2).equals(this.get_element(itr, itr2+1)) && flg>0&&flg2==0){
				if(!this.get_element(itr, itr2).equals("_")) {
					flg+=1;
					flg2=1;
				}
			}

			flg2=0;

			
			
			
			if(flg>=size-1) {
				break;
			}
			itr2=itr2+1;

			}
			else {
				break;
			}
			
		}

		if(flg>=size-1&& flg>0) {
			return true;
		}
		else {
			return false;
		}

	}	
	
	private void place_pieces(int x, int y, String c) {
		this.cells.get(this.width*y+x).set_content(c);
	}
	
	public boolean move(int x, int y, String c) {
		if(x>this.width-1) {
			System.out.println("Invalid Move!");
			return false;
		}
		if(y>this.height-1) {
			System.out.println("Invalid Move!");
			return false;
		}
		if(x<0) {
			System.out.println("Invalid Move!");
			return false;
		}
		if(y<0) {
			System.out.println("Invalid Move!");
			return false;
		}
		if(!this.get_element(x, y).equals("_")) {
			System.out.println("Invalid Move!");
			return false;
		}
		else {
			this.place_pieces(x, y, c);
		}
		return true;
	}
	//module check
	public static void main(String[] args) {
		board b = new board(3,3);
		b.move(5,0, "O");
		b.move(4,0, "O");
		b.move(3,0, "O");
		b.move(2,0, "O");
		b.move(1,0, "O");
		b.move(0, 0, "O");
		b.move(6, 0, "O");
		b.move(0,1,"O");
		b.move(0, 2, "O");
		b.move(1, 1, "O");
		b.move(2, 2, "O");
		b.print_grid();
		
		System.out.println(b.check_secondary_diagonal(3, 2, 0));
		
		
	}
}
