import java.util.Scanner;
import java.lang.Math;

public class Triangulo {
	float lado;

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();
		
		triangulo.lado= pideDatos("Introduce el tamaño del lado en cm:");
		calculaPerimetro(triangulo);
		calculaArea(triangulo);	
	}

	public static float pideDatos(String msj){
		System.out.println(msj);
		Scanner sc = new Scanner(System.in);
		float lado = sc.nextInt();
		return lado;
	}
	
	public static void calculaPerimetro(Triangulo triangulo){
		float perimetro = 0;
		perimetro = triangulo.lado * 3;
		System.out.println("El perimetro del triangulo es " +perimetro +" cms.");
	}
	
	public static void calculaArea(Triangulo triangulo){
		float area = 0;
		area = (float) (((Math.sqrt(3))/4)*Math.pow(triangulo.lado,2));
		System.out.println("El area del triangulo es " +area +" cms.");
	}
	
}
