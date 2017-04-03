
/**
 * Created by Sonal on 4/1/2017.
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
            } if(!isManhat){
            //checking Top Right Node
            if (current.x - 1 >= 0 && current.y + 1 < size) {
                nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }
			 //checking Top Right Node
            if (current.x - 1 >= 0 && current.y + 1 < size) {
                nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
			
                } //checking Top Right Node
            if (current.x - 1 >= 0 && current.y + 1 < size) {
                nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
         
				 //checking Top Right Node
            if (current.x - 1 >= 0 && current.y + 1 < size) {
                nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
				            if (current.x - 1 >= 0 && current.y + 1 < size) {
                nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
				            if (current.x - 1 >= 0 && current.y + 1 < size) {
                nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
				       nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
				
				       nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
				       nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
				
				
			     } if(!isManhat){
            //checking Top Right Node
            if (current.x - 1 >= 0 && current.y + 1 < size) {
                nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }     } if(!isManhat){
            //checking Top Right Node
            if (current.x - 1 >= 0 && current.y + 1 < size) {
                nextNode = gridNode[current.x - 1][current.y + 1];
                double newDistance = current.distance + diagonalDistance;
                if (!nextNode.blocked && !nextNode.visited && nextNode.distance > newDistance) {
                    nextNode.distance = newDistance;
                    nextNode.parent = current;
                    queue.add(nextNode);
                }
            }



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