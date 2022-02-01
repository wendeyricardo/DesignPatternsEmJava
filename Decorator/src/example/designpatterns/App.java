package example.designpatterns;

import java.awt.Color;

import example.designpatterns.gui.Window;
import example.designpatterns.shape.Circle;
import example.designpatterns.shape.ColorShape;
import example.designpatterns.shape.DashLineShape;
import example.designpatterns.shape.Shape;
import example.designpatterns.shape.Square;

public class App {

	public static void main(String[] args) {
		Window w = new Window("Shape", 300, 300);
		w.show();
		
		//Shape shape = new ColorShape(new Circle(), Color.BLUE);
		//Shape shape2 = new ColorShape(new Square(), Color.BLACK);
		Shape shape = new DashLineShape(new ColorShape(new Square(), Color.YELLOW));
		
		w.drawShape(shape);
	}

}
