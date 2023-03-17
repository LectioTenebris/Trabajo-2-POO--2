package tarea2;

public class Triangulo {
	double base;
	double altura;
	public Triangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	double area() {
		return (base*altura)/2;
	}
	double hipotenusa() {
		return Math.pow(Math.pow(altura,2)+Math.pow(base, 2), 1/2);
	}
	double perimetro() {
		return (base+altura+hipotenusa());
	}
	void tipotriangulo() {
		if ((base==altura) && (base == hipotenusa()) && (altura==hipotenusa()))
			System.out.println("Es equilatero");
		else 
			if ((base!=altura) && (base != hipotenusa()) && (altura!=hipotenusa()))
				System.out.println("Es escaleno");
			else
				System.out.println("Es isósceles");
		
	}

}
