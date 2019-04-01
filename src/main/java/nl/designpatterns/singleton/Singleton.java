package nl.designpatterns.singleton;

public class Singleton {
	
	private static Singleton instance = new Singleton(); // eager init.
	
	private Singleton() {}
	
	
	public static Singleton getInstance() {
		return instance;
	}
	
	//alternative - lazy init
	// 
	public synchronized static Singleton getInstanceSync(){
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

}
