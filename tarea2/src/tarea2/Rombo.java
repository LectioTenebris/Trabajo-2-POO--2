package tarea2;

public class Rombo {
	double diagmayor;
	double diagmenor;
	public Rombo(double diagmayor, double diagmenor) {
		this.diagmayor=diagmayor;
		this.diagmenor=diagmenor;
	}
	double area() {
		return(diagmayor*diagmenor)/2;
	}
	double perimetro() {
		return(2*(Math.pow((Math.pow(diagmenor, 2)+Math.pow(diagmayor,2)), 0.5)));
		
	}
}
