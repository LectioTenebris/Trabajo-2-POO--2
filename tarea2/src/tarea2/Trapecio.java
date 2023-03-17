package tarea2;

public class Trapecio {
	double basemayor;
	double basemenor;
	double altura;
	double ladosiguales;
	public Trapecio(double basemayor, double basemenor, double altura, double ladosiguales) {
		this.basemayor=basemayor;
		this.basemenor=basemenor;
		this.altura=altura;
		this.ladosiguales=ladosiguales;
	}
	double area() {
		return ((basemayor+basemenor)/2) *altura;
	}
	double perimetro() {
		return (basemayor+basemenor+ladosiguales);
	}
		
}

