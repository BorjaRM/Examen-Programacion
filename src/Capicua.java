import java.util.Scanner;

public class Capicua {
	String fraseOriginal;
	String frase;
	String fraseInvertida;
	boolean esCapicua;
	String continuar;

	public static void main(String[] args) {
		Capicua capicua = new Capicua();

		do{
			capicua.fraseOriginal= introduceDatos("Introduce una frase para comprobar si es capicua");
			capicua.frase=eliminaEspacios(capicua.fraseOriginal);
			capicua.fraseInvertida=fraseAlReves(capicua.frase);
			capicua.esCapicua=comparaFrases(capicua);
			muestraResultado(capicua);
			capicua.continuar=introduceDatos("¿Quieres volver a probar?");
		}while(capicua.continuar.equalsIgnoreCase("si"));		
	}
	
	
	public static String introduceDatos(String msj){
		System.out.println(msj);
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		return frase;
	}
	
	public static String eliminaEspacios(String frase){
		frase = frase.replace(" ","");
		return frase;
	}
	
	public static String fraseAlReves(String frase){
		String fraseInvertida="";
		for (int i=frase.length()-1;i>=0;i--){
			fraseInvertida = fraseInvertida + frase.charAt(i);
		}
		return fraseInvertida;
	}
	
	public static boolean comparaFrases(Capicua capicua){	
		//nos dice si la frase invertida y la original son iguales o no.
		return capicua.frase.equalsIgnoreCase(capicua.fraseInvertida);		 
	}

	public static void muestraResultado(Capicua capicua){
		if(capicua.esCapicua==true){
			System.out.println("La frase " +capicua.fraseOriginal +" SI es capicua.");
		}else{
			System.out.println("La frase " +capicua.fraseOriginal +" NO es capicua.");	
		}
	}
}
