
public class Alumnos {
	final String lista="2016;11;22;30;alumnes;DAM#2015;11;5;32;alumnes;DAM#2014;7;9;32;alumnes;DAM";
	int posInicial;
	int posFinal;
	int totalAlumnos;
	public static void main(String[] args) {
		
		Alumnos alumnos = new Alumnos();
		
		buscaUltimoDigito(alumnos);
		System.out.println("En total hay " +alumnos.totalAlumnos +" alumnos.");

	}			
	
	public static void buscaUltimoDigito(Alumnos alumnos){
		//Como sabemos que el numero de alumnos es el ultimo datos antes de "alumnos" buscamos la primera "a" para situarnos.
		
		int posicionActual;
		char caracter;
		
		for(int i=0;i<alumnos.lista.length();i++){
			posicionActual = i;
			caracter = alumnos.lista.charAt(i);
			if (caracter == 'a'){
				alumnos.posFinal = posicionActual-2; //El ultimo digito siempre se encontrará dos posiciones anteriores a la "a".
				buscaPrimerDigito(alumnos);
			}
		}
	}
		
	public static void buscaPrimerDigito(Alumnos alumnos){
		//Podemos averiguar la posicion del primer digito buscando la posicion del ";" anterior al segundo digito.
		
		for(int j=alumnos.posFinal;alumnos.lista.charAt(j)!=';';j--){
			alumnos.posInicial=j;							
		}
		divideCadena(alumnos);
	}
	
	public static void divideCadena(Alumnos alumnos){
		String nAlumnos="";
		nAlumnos = alumnos.lista.substring(alumnos.posInicial,alumnos.posFinal+1);
		pasarStringAInt(nAlumnos,alumnos);		
	}
	
	public static void pasarStringAInt(String nAlumnos, Alumnos alumnos){
		int alumnosXLista=0;
		alumnosXLista = Integer.parseInt(nAlumnos);
		sumaAlumnos(alumnosXLista,alumnos);
	}

	public static void sumaAlumnos(int alumnosXLista, Alumnos alumnos){
	alumnos.totalAlumnos=alumnos.totalAlumnos+alumnosXLista;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
