package aufgaben.aufgabe3;

public class Point {
	private int row;
	private int col;
	

	public Point(int row, int col)
	{
		this.row = row;
		this.col = col;
	}
	
	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}
	
	@Override
	public String toString()
	{
		return "("+ (this.row+1) + "," + (this.col+1) + ")";
	}


}
