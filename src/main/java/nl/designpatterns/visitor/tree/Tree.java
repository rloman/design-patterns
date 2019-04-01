package nl.designpatterns.visitor.tree;

public class Tree {
	
	public int value = -1;
	
	public Tree left;
	public Tree right;
	
	public void put(int aValue) {
		if(this.value == -1) {
			this.value = aValue;
			
			left = new Tree();
			right = new Tree();
			
			return;
		}
		if(this.value < aValue){ // insert right 
			right.put(aValue);
			
			return;
		}
		if(this.value > aValue) { //insert left
			left.put(aValue);
		}
	}
	
	public void accept(TreeVisitor v) {
		if(this.value!=-1) v.visit(this);
	}
	
	@Override
	public String toString() {
		if(this.value != -1) {
			return ""+this.value;
		}
		else {
			return "";
		}
	}

}
