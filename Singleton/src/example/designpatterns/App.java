package example.designpatterns;

public class App {

	public static void main(String[] args) {
		
		SecurityManager sm1 = SecurityManager.getInstance();
		sm1.login();
		
		/*
		 * SecurityManager sm2 = new SecurityManager();
		sm2.login(); 
		*/
		
	}
}
