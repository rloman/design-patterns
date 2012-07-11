package nl.designpatterns.composite;

import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		
		TreeImpl tree = new TreeImpl(13);
		tree.add(15);
		tree.add(17);
		
		Iterator<Tree> i =  tree.iterator();
		while(i.hasNext()) {
			Tree t = (Tree) i.next();
			System.out.println(t.get());
			
		}

	}

}
