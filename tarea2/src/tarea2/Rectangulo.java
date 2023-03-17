package tarea2;

public class Rectangulo {
	float base;
	float altura;
	public Rectangulo(float base, float altura) {
		this.base=base;
		this.altura=altura;
	}
	float area() {
		return (base*altura);
	}
	float perimetro() {
		return((2*base)+(2*altura));
	}
}
