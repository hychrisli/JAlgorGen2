package jalgor_gen2.other;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class ShortestPath {

    class Pnt {
	int x;
	int y;

	Pnt(int x, int y) {
	    this.x = x;
	    this.y = y;
	}

	public String toString() {
	    return "(" + x + ", " + y + ")";
	}
    }

    class Edge {

	Pnt a;
	Pnt b;
	int len;

	Edge(Pnt a, Pnt b, int len) {
	    this.a = a;
	    this.b = b;
	    this.len = len;
	}
	
	public String toString(){
	    return toEdgeStr(a, b);
	}
    }

    private int[][] maze;
    int rowNum, colNum, INF;
    private List<Pnt> pnts = new LinkedList<Pnt>();
    private Set<String> pntStrSet = new HashSet<String>();
    private Map<String, Integer> minEdges = new HashMap<String, Integer>();
    private List<Edge> minPaths = new ArrayList<Edge>();
    

    private Pnt tom;
    private Pnt jry;

    public int getShortestPath() {
	
	for (Pnt pnt : pnts){
	    bfs(pnt);
	    if ( ! minEdges.containsKey(toEdgeStr(pnt, tom)))
		return -1;
	}
	
	//System.out.println(Arrays.asList(minEdges)); 
	getAllPaths(tom, tom, pnts.subList(0, pnts.size()-2), 0);
	// System.out.println(minPaths);
	
	int minPath = INF;
	for (Edge path : minPaths){
	    // System.out.println(path.toString() + ": " + path.len);
	    minPath = Math.min(minPath, path.len + minEdges.get(toEdgeStr(path.b, jry)));
	}
	return minPath;
    }

    // shortest edge between any given points
    public void bfs(Pnt start) {
	boolean[][] visited = new boolean[rowNum][colNum];
	Queue<Edge> stgQ = new LinkedList<Edge>();
	
	for (boolean[] row : visited)
	    Arrays.fill(row, false);

	stgQ.add(new Edge(start, start, 0));
	int goal = pnts.size() + 1;
	
	
	while (!stgQ.isEmpty() && goal > 0) {

	    Edge curE = stgQ.poll();
	    Pnt curP = curE.b;
	    visited[curP.x][curP.y] = true;

	    // hit wall
	    if (maze[curP.x][curP.y] == 1)
		continue;

	    // found a point
	    if (pntStrSet.contains(curP.toString())) {
		minEdges.put(curE.toString(), curE.len);
	    }

	    // moving forward
	    if (curP.x > 0 && !visited[curP.x - 1][curP.y])
		stgQ.add(new Edge(start, new Pnt(curP.x - 1, curP.y), curE.len + 1));

	    if (curP.x < rowNum - 1 && !visited[curP.x + 1][curP.y])
		stgQ.add(new Edge(start, new Pnt(curP.x + 1, curP.y), curE.len + 1));

	    if (curP.y > 0 && !visited[curP.x][curP.y - 1])
		stgQ.add(new Edge(start, new Pnt(curP.x, curP.y - 1), curE.len + 1));

	    if (curP.y < colNum - 1 && !visited[curP.x][curP.y + 1])
		stgQ.add(new Edge(start, new Pnt(curP.x, curP.y + 1), curE.len + 1));
	}
    }
    
    // Permutation
    public void getAllPaths(Pnt start, Pnt pre, List<Pnt> pnts, int len){
	
	if (pnts.size() == 1)
	    minPaths.add(
		    new Edge(start, 
			    pnts.get(0), 
			    len + minEdges.get(toEdgeStr(pre, pnts.get(0)))));
	
	for (int i = 0; i < pnts.size(); i++) {
	    List<Pnt> others = new LinkedList<Pnt>(pnts);
	    others.remove(i);
	    Pnt cur = pnts.get(i);
	    getAllPaths(start,
		    cur,
		    others, 
		    len + minEdges.get(toEdgeStr(pre, cur)));
	}
    }

    public void run() {
	Scanner scan = new Scanner(System.in);
	rowNum = scan.nextInt();
	colNum = scan.nextInt();
	INF = rowNum * colNum + 1;
	maze = new int[rowNum][colNum];

	for (int i = 0; i < rowNum; i++) {
	    for (int j = 0; j < colNum; j++) {
		maze[i][j] = scan.nextInt();
		if (maze[i][j] == 2){
		    Pnt pnt = new Pnt(i, j);
		    pnts.add(pnt);
		    pntStrSet.add(pnt.toString());
		}
	    }
	}

	jry = new Pnt(scan.nextInt(), scan.nextInt());
	pnts.add(jry);
	pntStrSet.add(jry.toString());
	scan.close();

	tom = new Pnt(0, 0);
	pnts.add(tom);
	pntStrSet.add(tom.toString());
	//printInput();

	System.out.println(getShortestPath());
    }

    private String toEdgeStr(Pnt a, Pnt b){
	return a.toString() + "-" + b.toString();
    }
    
    private void printInput() {
	System.out.println("maze: " + Arrays.deepToString(maze));
	System.out.println("cheese: ");
	pntStrSet.forEach(System.out::println);
	System.out.println("Jerry: " + jry.toString());
	System.out.println("INF: " + INF);
    }

    public static void main(String[] args) throws IOException {
	ShortestPath sp = new ShortestPath();
	sp.run();

    }
}


/*
 * 
 * 
 * 
Test 1

3
3
0 0 1
2 1 0
0 2 0
1
2


Test 2
5
6
0 0 0 2 1 2
0 1 0 0 0 0
2 1 0 1 0 1
1 0 0 1 2 0
0 0 0 0 0 1
4
0
 * 
 * 
 * */
