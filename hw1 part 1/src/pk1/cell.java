package pk1;

public class cell {
	private int x;
	private int y;
	private String content;
	public cell(int i,int j,String c) {
		this.x=i;
		this.y=j;
		this.content=c;
	}
	public String get_content() {
		return this.content;
	}
	public void set_content(String c) {
		this.content=c;
	}
}
