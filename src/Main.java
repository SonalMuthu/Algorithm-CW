
/**
 * Created by Sonal  on 4/1/2017.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args){

	       
		 
		 	PathFindingOnSquaredGrid grid= new PathFindingOnSquaredGrid();
		 	
		 	 // The following will generate a 10x10 squared grid with relatively few obstacles in it
	        // The lower the second parameter, the more obstacles (black cells) are generated
		 	
	        boolean[][] randomlyGenMatrix = grid.random(10,0.6);
	       
	        StdArrayIO.print(randomlyGenMatrix);
	        grid.show(randomlyGenMatrix, true);

	        // Reading the coordinates for points A and B on the input squared grid.

	        Scanner in = new Scanner(System.in);
	        
	        System.out.println("\nENTER x1 FOR A >");
	        int Ay1 = in.nextInt();
	        
	        System.out.println("ENTER y1 fOR A > ");
	        int Ax1 = in.nextInt();
	        
	        System.out.println("ENTER x2 FOR B > ");
	        int By2 = in.nextInt();
	        
	        int Ax1 = in.nextInt();
	        
	        System.out.println("ENTER x2 FOR B > ");
	        int By2 = in.nextInt();
	        
	        System.out.println("ENTER y2 FOR B > ");
	        int Bx2 = in.nextInt();
			
	        System.out.println("ENTER x2 FOR B > ");
	        int By2 = in.nextInt();
	        
	        System.out.println("ENTER y2 FOR B > ");
	        int Bx2 = in.nextInt();
			
	        System.out.println("\nENTER x1 FOR A >");
	        int Ay1 = in.nextInt();
	        
	        System.out.println("ENTER y1 fOR A > ");
	        int Ax1 = in.nextInt();
	        
	        System.out.println("ENTER x2 FOR B > ");
	        int By2 = in.nextInt();
	        
	        int Ax1 = in.nextInt();
	        
	        System.out.println("ENTER x2 FOR B > ");
	        int By2 = in.nextInt();
	        
	        System.out.println("ENTER y2 FOR B > ");
	        int Bx2 = in.nextInt();
			
	        System.out.println("\nENTER x1 FOR A >");
	        int Ay1 = in.nextInt();
	        
	        System.out.println("ENTER y1 fOR A > ");
	        int Ax1 = in.nextInt();
	        
	        System.out.println("ENTER x2 FOR B > ");
	        int By2 = in.nextInt();
	        
	        int Ax1 = in.nextInt();
	        
	        System.out.println("ENTER x2 FOR B > ");
	        int By2 = in.nextInt();
	        
	        System.out.println("ENTER y2 FOR B > ");
	        int Bx2 = in.nextInt();
			
	        
	        Stopwatch time = new Stopwatch();
	        
	        //ArrayList<PathFindingOnSquaredGrid.Node> path1 = new PathFindingOnSquaredGrid().distance(randomlyGenMatrix, Ax1, Ay1, Bx2, By2,grid.Manhattan(),"MANHATTAN",true);
	        //System.out.println(time.elapsedTime());
	        
	       // ArrayList<PathFindingOnSquaredGrid.Node> path2 = new PathFindingOnSquaredGrid().distance(randomlyGenMatrix, Ax1, Ay1, Bx2, By2,grid.Euclidean(),"EUCLIDEAN",false);
	       ArrayList<PathFindingOnSquaredGrid.Node> path3 = new PathFindingOnSquaredGrid().distance(randomlyGenMatrix, Ax1, Ay1, Bx2, By2,grid.Chebyshev(),"CHEBYSHEV",false);
	        
	        grid.show(randomlyGenMatrix, true, Ax1, Ay1, Bx2, By2, path3);

	    }
}
