package AbstractionDemo1;

public class Triangle extends Shape{

	
	Triangle(double a, double b){
		super(a, b);
	}
	
	void Area() {
		double res = a*b;
		System.out.println("Triange Area : "+res);
	}

}
