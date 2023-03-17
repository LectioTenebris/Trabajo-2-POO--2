package tarea2;

public class Clasemain {
	public static void main(String args[]) {
		cuadrado f1= new cuadrado(5);
		Rectangulo f2 = new Rectangulo(5,8);
		Triangulo f3 = new Triangulo(6,7);
		circulos f4 = new circulos(8);
		Rombo f5 = new Rombo(8,10);
		Trapecio f6 = new Trapecio(10,12,8, 9);
		
	System.out.println("El area del cuadrado es: " + f1. area());
	System.out.println("El perímetro del cuadrado es:" +f1. perimetro());
	System.out.println("El area del rectángulo es: " +f2. area());
	System.out.println("El perímetro del rectángulo es: " +f2. perimetro());
	System.out.println("El area del triángulo es: " +f3. area());
	System.out.println("El perímetro del triángulo es: " +f3. perimetro());
	f3.tipotriangulo();
	System.out.println("El área del círculo es: "+ f4. calculararea());
	System.out.println("El area del rombo es: "+ f5. area());
	System.out.println("El perímetro del rombo es: "+ f5. perimetro());
	System.out.println("El area del Trapecio es: "+ f6. area());
	System.out.println("El perimetro del trapecio es: "+ f6. perimetro());
	}
	
}
