package nl.designpatterns.composite;

import java.util.Iterator;


public class Application {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.add(13);
		tree.add(15);
		tree.add(17);
		tree.add(19);
		
		Iterator<Tree> i =  tree.iterator();
		System.out.println(i);
		while(i.hasNext()) {
			Tree t = (Tree) i.next();
			System.out.println("Element: "+t.get());
			
		}
		System.out.println("Ending ...");
		
		tree.traverse();

	}

}
