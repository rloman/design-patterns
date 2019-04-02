package nl.designpatterns.singleton;

public class Application {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		
		System.out.println(s.hashCode());
		
		System.out.println(SingletonEnum.Elvis.getAge());

	}

}
