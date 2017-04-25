
/**
 * Created by Sonal Baba on 4/1/2017.
 */

import java.awt.*;
import java.util.*;

public class PathFindingOnSquaredGrid {

	Node start;
	Node end;
	Node[][] gridNode;

	// Horizontal and VerticalDistance
	double hVDistance = 1.0;

	// Diagonal Distance
	// Manhattan values.
	public static double Manhattan() {

		double diagonalDistance = 2;
		return diagonalDistance;
	}

	// Euclidean values.
	public static double Euclidean() {
		double diagonalDistance = 1.4;
		return diagonalDistance;
	}

	// Chebyshev values.
	public static double Chebyshev() {
		double dDistance = 1;
		return dDistance;
	}

	public ArrayList<Node> distance(boolean[][] matrix, int startx, int starty, int endx, int endy,double diagonalDistance,String name,boolean isManhat) {

        int size = matrix.length;
   
        start = new Node(startx, starty);
        end = new Node(endx, endy);
        // The grid that is used to store nodes
        gridNode = new Node[size][size];
        // Creating nodes and finding blocked cells in matrix and mapping accordingly to our grid
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
            	gridNode[i][j] = new Node(i, j);
                if (matrix[i][j] == false) {

                	gridNode[i][j].blocked = true;


                }
            }
        }

        // setting start distance to 0.
        // All other nodes will have infinity distance at the beginning
        start.distance =0;

        // a comparator object to deal with Priority Queue
        Comparator<Node> adjacencyComparator = (left, right) -> {
            if (left.distance > (right.distance)) {
                return 1;

            }
            return -1;
        };

        //A Priority Queue to store visiting nodes
        Queue<Node> queue = new PriorityQueue(size, adjacencyComparator);

        queue.add(start);

        while (queue.size() > 0) {
            Node current = queue.remove();
          //next selected node, it is to save adjacency cell temporary
            Node nextNode;
            //Breaks the loop when then end node becomes the current node 
            if (current.x==end.x && current.y==end.y){
            	break;
            }
            

            if(!isManhat){
            //checking Top Left Node
            if (current.x - 1 >= 0 && current.y - 1 >= 0) {
                nextNode = gridNode[current.x - 1][current.y - 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }}


            //Checking Top Node
            if (current.x - 1 >= 0) {
                nextNode = gridNode[current.x - 1][current.y];
                double newDistance = current.distance + hVDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }


            if(!isManhat){
            //checking Top Right Node
            if (current.x - 1 >= 0 && current.y + 1 < size) {
                nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }}


            //checking Left Node
            if (current.y - 1 >= 0) {
                nextNode = gridNode[current.x][current.y - 1];
                double newDistance = current.distance + hVDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }


            //checking Right Node
            if (current.y + 1 < size) {
                nextNode = gridNode[current.x][current.y + 1];
                double newDistance = current.distance + hVDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }


            if(!isManhat){
            //checking Bottom Left Node
            if (current.x + 1 < size && current.y - 1 >= 0) {
                nextNode = gridNode[current.x + 1][current.y - 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }}

            //checking Bottom Node
            if (current.x + 1 < size) {
                nextNode = gridNode[current.x + 1][current.y];
                double newDistance = current.distance + hVDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }

            if(!isManhat){
            //checking Bottom Right Node
            if (current.x + 1 < size && current.y + 1 < size) {
                nextNode = gridNode[current.x + 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }}
            current.visited = true;
        }

        ArrayList<Node> path = new ArrayList<>();

        // Checking if a path exists
        if (!(gridNode[end.x][end.y].distance == Integer.MAX_VALUE || gridNode[start.x][start.y].distance == Integer.MAX_VALUE)) {
            //Trace back the path
            Node current = gridNode[end.x][end.y];
            System.out.println(name+":"+current.distance);
            while (current.parent != null) {
            	//add visited,lowest parent nodes to the path variable
                path.add(current.parent);

                current = current.parent;
            }
        } else System.out.println("NO POSSIBLE PATH");


        return path;
    }

//inner node class  
    class Node {
        int x;
        int y;
        double distance = Integer.MAX_VALUE;
        Node parent = null;
        boolean visited;
        boolean blocked;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

	// the first show method is to show the randomly generated bloked cells
	public static void show(boolean[][] a, boolean which) {
		int N = a.length;
		StdDraw.setXscale(-1, N);
		StdDraw.setYscale(-1, N);
		StdDraw.setPenColor(StdDraw.BLACK);
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (a[i][j] == which)
					StdDraw.square(j, N - i - 1, .5);
				else
					StdDraw.filledSquare(j, N - i - 1, .5);
	}

	// draw the N-by-N boolean matrix to standard draw, including the points A
	// (x1, y1) and B (x2,y2) to be marked by a circle
	public static void show(boolean[][] a, boolean which, int x1, int y1, int x2, int y2, ArrayList<Node> path) {
		int N = a.length;
		int s = path.size();
		int count = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (a[i][j] == which)
					if ((i == x1 && j == y1) || (i == x2 && j == y2)) {
						StdDraw.setPenColor(Color.RED);
						StdDraw.filledCircle(j, N - i - 1, .5);

					}

		// show the shortest path
		for (PathFindingOnSquaredGrid.Node node : path) {
			if (s - count == 1) {
				return;
			}
			count++;

			StdDraw.setPenColor(Color.BLUE);
			StdDraw.filledCircle(node.y, N - node.x - 1, .5);

		}
	}

	// return a random N-by-N boolean matrix, where each entry is
	// true with probability p(

	public static boolean[][] random(int N, double p) {
		boolean[][] a = new boolean[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				a[i][j] = StdRandom.bernoulli(p);
		return a;
	}

}
