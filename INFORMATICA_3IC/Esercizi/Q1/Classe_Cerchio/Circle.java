import java.lang.Math;
public class Circle{
	private double ray;					//variabile
Circle (double r){						//costruttore raggio
	ray=r;
	}
public void setRay (double r){ 			//setRay
	ray=r;
	}
public double getCirconf(){				//getCirconf
	double circonf=2*ray*Math.PI;
	return circonf;
	}
public double getArea(){				//getArea
	double area=ray*ray*Math.PI;
	return area;
	}
}