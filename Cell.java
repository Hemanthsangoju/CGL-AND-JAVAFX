
public class Cell {
	private int row;
	private int col;
	private boolean status;
	
	public Cell(int row, int col, boolean status) {
		this.row = row;
		this.col = col;
		this.status = status;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
