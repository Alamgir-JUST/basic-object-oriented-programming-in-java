package AbstractionDemo1;

public class Rectangle extends Shape{
	
	
	Rectangle(double a, double b) {
		super(a, b);
	}
	
	void Area() {
		double res = .5*a*b;
		
		System.out.println("Rectange Area : "+res);
	}
}
