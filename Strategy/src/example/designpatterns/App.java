package example.designpatterns;

public class App {
	public static void main(String[] args) {

		Person p = new Person("Wendey ");
		p.move(new RunMovement(), 50);
	}
}
