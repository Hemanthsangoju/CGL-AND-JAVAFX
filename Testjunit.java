import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testjunit {

	@Test
	   public void testBoardOne() {
		   Board b1 = new Board();
		   String val = "..........\n"
				   +"...**.....\n"
				   +"....*.....\n"
				   +"..........\n"
				   +"..........\n"
				   +"...**.....\n"
				   +"..**......\n"
				   +".....*....\n"
				   +"....*.....\n"
				   +"..........\n";
		   int[][] l = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		   Cell[][] cells = b1.createBoard(10,l);
	       System.out.println("======TEST ONE EXECUTED=======");
	       Assertions.assertEquals(val, b1.printBoard(cells).toString());
	   }

	   @Test
	   public void testBoardTwo() {
		   Board b1 = new Board();
		   Game game = new Game();
		   String val = "..........\n"
				   +"...**.....\n"
				   +"...**.....\n"
				   +"..........\n"
				   +"..........\n"
				   +"..***.....\n"
				   +"..**......\n"
				   +"...**.....\n"
				   +"..........\n"
				   +"..........\n";
		   int[][] l = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		   Cell[][] cells = b1.createBoard(10,l);
//		   System.out.println(b1.printBoard(cells));
		   Cell[][] final1 = game.generateNextGeneration(cells);
	       System.out.println("======TEST TWO EXECUTED=======");
	       Assertions.assertEquals(val, b1.printBoard(final1).toString());
	   }
}
