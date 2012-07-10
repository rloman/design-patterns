package nl.designpatterns.composite;

public class NullTreeImpl implements Tree {
	
	@Override
	public void traverse() {
	}

	@Override
	public void add(Object o) {
		return;
	}

}
