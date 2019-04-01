package nl.designpatterns.facade.enumeration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List <String> l = new ArrayList<String>();
		l.add("Annebert");
		l.add("Raymond");
		l.add("Lieke");
		l.add("Wout");
		Enumeration<String> enumeration = new IteratorAdapter<String>(l.iterator());
		while(enumeration.hasMoreElements()) {
			String s = enumeration.nextElement();
			
			System.out.println(s);
		}

	}

}
