package AbstractionDemo1;

import java.text.DecimalFormat;

public class Circle extends Shape{

	
	Circle(double a){
		super(a, a);
	}
	
	void Area() {
		double res = Math.PI*a*a;
		DecimalFormat df = new DecimalFormat(".00");
		//df.format(res);
		System.out.println("Circle Area : "+df.format(res));
	}
}
