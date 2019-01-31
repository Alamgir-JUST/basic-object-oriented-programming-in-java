package AbstractionDemo1;


public abstract class Shape {

	double a, b;

	Shape(double a, double b) {
		this.a = a;
		this.b = b;
	}

	abstract void Area();
}
