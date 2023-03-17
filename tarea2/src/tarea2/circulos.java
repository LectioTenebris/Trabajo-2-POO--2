package tarea2;

public class circulos {
	float radio;
	public circulos(float radio) {
		this.radio=radio;
	}
	double calculararea() {
		return Math.pow(radio, 2)*Math.PI;
	}
	double calcularperimetro() {
		return 2*Math.PI*radio;
	}
}
