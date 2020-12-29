import java.util.Scanner;

public class Game {
	
	public Game() {}
	
	 /**
     * Method to generate a next generation. Call the printBoard
     * to print the next generation.
     * 
     * @param board[][] board
     * 
     */
    public int countLiveCells(Cell[][] current,int p,int q){
        int n = current.length;
        int lives=0;
        for(int i=p-1;i<=p+1;i++){
            for(int j=q-1;j<=q+1;j++){
                if(i!=p || j!=q){
                    if(i>=0 && i<n && j>=0 && j<n && current[i][j].isStatus()==true){
                        lives+=1;
                    }
                }
            }
        }
        return lives;
    }
    
    
    public Cell[][] generateNextGeneration(Cell current[][]) {
        int n = current.length;
        Cell[][] newBoard = new Cell[n][n];
       // lives = 3;
       // board = createBoard(n,l);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int ilives = countLiveCells(current,i,j);

                if(current[i][j].isStatus()==true){
                    if(ilives<2){ 
                        newBoard[i][j] = new Cell(i,j,false);
                    }else if(ilives<=3){
                        newBoard[i][j] = new Cell(i,j,true);
                    } else if(ilives>3){
                        newBoard[i][j] = new Cell(i,j,false);
                    }
                }
                else{
                    if(ilives==3){
                        newBoard[i][j] = new Cell(i,j,true);
                    }
                    else {
                    	newBoard[i][j] = new Cell(i,j,false);
                    }
                }
                
                
            }
        }
        return newBoard;
    }
    
    
    /**
     * Do not modify this main Method.
     * 
     * @param args
     * @return
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the Board
        int n = sc.nextInt();
        
        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] l = new int[m][2];
        int i = 0;
        
        // Reading Live cells
        while (sc.hasNextInt()) {
            l[i][0] = sc.nextInt();
            l[i++][1] = sc.nextInt();
        }
        
        // creating instance to CGLVersion2
        Game c = new Game();
        Board b = new Board();
        // creating nextgenratin by calling nextgenration method
        Cell[][] obj1 = b.createBoard(n, l);
        System.out.println(b.printBoard(obj1));
        Cell[][] obj = c.generateNextGeneration(obj1);
        System.out.println(b.printBoard(obj));
        sc.close();
    }
}
