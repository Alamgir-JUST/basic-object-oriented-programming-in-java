package AbstractionDemo1;

public class MainClass {
	public static void main(String[] args) {
		Shape shape;
		
		shape = new Triangle(5.8,5.8);
		shape.Area();
		
		shape = new Rectangle(5, 5);
		shape.Area();
		
		shape = new Circle(5);
		shape.Area();
		
	}
}
