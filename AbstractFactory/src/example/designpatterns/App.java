package example.designpatterns;

import example.designpatterns.gui.Window;
import example.designpatterns.shape.Shape;
import example.designpatterns.shape.ShapeAbstractFactory;
import example.designpatterns.shape.ShapeFactoryProducer;


public class App {

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		ShapeAbstractFactory factory = ShapeFactoryProducer.getFactory(false);
		Shape shape = factory.newShape("circle");
		
		w.drawShape(shape);
	}
}
