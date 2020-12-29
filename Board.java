
public class Board {
	
	Cell[][] cell;
	
	public Board() {}
	
	public Cell[][] createBoard(int n, int l[][]) {
        cell =new Cell[n][n];
        for(int i=0 ; i<n;i++) {
        	for(int j=0;j<n;j++) {
        		cell[i][j] = new Cell(i,j,false);
        	}
        }
        for(int i=0;i<l.length;i++){
    //     System.out.print(liveCells[i][0]);//row value
    //     System.out.print(liveCells[i][1]);//column value
         int row=l[i][0];
         int col=l[i][1];
         cell[row][col].setStatus(true);
        }
     //   System.out.println("Board");
    // You can call the printBoard that prints the board.

        return cell;
    }

    /**
     * Check for the writeup on how to print the board.
     * @param board[][]
     * @param n
     * @return
     */
    public StringBuffer printBoard(Cell board[][]) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                //System.out.print(board[i][j]+" ");
                if(board[i][j].isStatus() == true)
                    sb.append("*");
                else
                    sb.append(".");
                
            }
            sb.append("\n");
        }
        return sb;
    }


}
