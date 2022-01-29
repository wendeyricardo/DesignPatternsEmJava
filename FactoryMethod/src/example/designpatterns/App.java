package example.designpatterns;

import example.designpatterns.gui.Window;
import example.designpatterns.shape.Shape;
import example.designpatterns.shape.ShapeFactory;


public class App {

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		Shape shape = ShapeFactory.newShape();
		
		w.drawShape(shape);
	}
}

