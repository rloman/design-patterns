package nl.designpatterns.composite;


public class Main {

	public static void main(String[] args) {
		
		TreeImpl tree = new TreeImpl(13);
		
		//tree.traverse();
		
		int teller = 0;
		CompositeIterator i = (CompositeIterator) tree.iterator();
		while(i.hasNext()) {
			//System.out.println(++teller);
			Tree t = (Tree) i.next();
			System.out.println(i.getStack());
			//System.out.println(t.get());
			
		}

	}

}
