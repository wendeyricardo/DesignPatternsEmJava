package example.designpatterns.shape;

public class FillShapeFactory extends ShapeAbstractFactory {

	@Override
	public Shape newShape(String type) {
		if (type.equals("circle")) {
			return new NotFillCircle();
		} else if (type.equals("square")) {
			return new NotFillSquare();
		}
		return null;
	}

}
