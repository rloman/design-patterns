package nl.designpatterns.flyweight;

public class Tree {
	
	//id is x and y.
	public int x;
	public int y;
	
	public int age;
	
	// no getters/setters this time...
	
	public Tree(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Tree(int x, int y, int age) {
		this(x,y);
		this.age = age;
	}
	
	

}
