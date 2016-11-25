import java.util.Scanner;

public class Calendario {
	final String encabezado="DL DM DX DJ DV DS DG";
	final String meses= "#enero,marzo,mayo,julio,agosto,octubre,diciembre#abril,junio,septiembre,noviembre#febrero";
	final String dias=" #lunes#martes#miercoles#jueves#viernes#sabado#domingo";
	String mesElegido;
	String diaElegido;
	String calendario="";
	int grupoMes;
	int nDias;
	int posInicial;

	public static void main(String[] args) {
		Calendario calendario = new Calendario();		
		
		//Introducir mes y dia:
			calendario.mesElegido=introduceDatos("Elige un mes");
			calendario.diaElegido=introduceDatos("Elige un dia de la semana");
		
		//divide los meses en 3 grupos en funcion de su posicion en el String para calcular los dias:
			calendario.grupoMes=contador(calendario.meses,calendario.mesElegido); 		
			calendario.nDias=calculaDias(calendario.grupoMes);
			//System.out.println(calendario.nDias);

		//calcula posicion inicial del calendario en funcion del dia elegido:
			calendario.posInicial=contador(calendario.dias,calendario.diaElegido);
			//System.out.println(calendario.posInicial);
			
			generaCalendario(calendario);

	}
	public static String introduceDatos(String msj){
		System.out.println(msj);
		Scanner sc = new Scanner(System.in);
		String dato = sc.nextLine().toLowerCase();
		return dato;
	}
	
	public static int contador(String meses, String mesElegido){
		//calcula posiciones mediante los # de las cadenas.
		int contador=0;		
		for(int i=0;i<meses.indexOf(mesElegido);i++){
			if (meses.charAt(i)=='#'){
				contador++;
			}
		}
		return contador;
	}
	
	public static int calculaDias(int grupo){
		int dias=0;
		switch(grupo){
			case 1:
				dias=31;
				break;
			case 2:
				dias=30;
				break;
			case 3:
				dias=28;
				break;
		}
		return dias;
	}
	
	public static void generaCalendario(Calendario calendario){
		//distribuye espacios y dias en el calendario
		System.out.println(calendario.encabezado);
		espaciosIniciales(calendario.posInicial);		
		imprimeCalendario(calendario);		
	}
	
	public static void espaciosIniciales(int posInicial){
		//genera espacios al inicio del calendario en funcion del dia de la semana elegido.
		for (int huecos=1;huecos<posInicial;huecos++)
			System.out.print("   ");		
	}
	
	public static void imprimeCalendario(Calendario calendario){
		int contador=calendario.posInicial; //posicion del dia 1
		String espacio="  ";
		
		//genera dias:
		for(int dias=1;dias<=calendario.nDias;dias++){
			if (dias>9){
				espacio=" ";
			}
			calendario.calendario=dias+espacio;
			//salto de linea al completar semana:
			if(contador>7){
				contador=1;
				System.out.println("");
			}
			System.out.print(calendario.calendario);
			contador++;
		}
	}
	
	
	
	
	
	
	
	
	
	
}
