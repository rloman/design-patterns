package nl.designpatterns.visitor;

public class Program {
	
	Declaration declaration = new Declaration();
	Statement statement = new Statement();
	
	public void accept(Visitor v) {
		v.visit(this);
		//declaration.accept(v); // kan niet vanwege recursion
		//statement.accept(v);
		
	}

}
