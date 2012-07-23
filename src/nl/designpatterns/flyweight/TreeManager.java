package nl.designpatterns.flyweight;

public class TreeManager {
	
	public int[][]xy = new int[50][50];
	
	public void addTree(Tree tree) {
		this.xy[tree.x][tree.y] = tree.age;
		
	}
	
	public Tree getTree(int x, int y) {
		Tree tree = new Tree(x,y,this.xy[x][y]);
		
		return tree;
	}
	
	

}
