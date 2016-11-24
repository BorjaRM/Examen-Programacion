
public class Alumnos {
	final String lista="2016;11;22;30;alumnes;DAM#2015;11;5;32;alumnes;DAM#2014;7;9;32;alumnes;DAM";	
	public static void main(String[] args) {
		
		Alumnos alumnos = new Alumnos();
		
		cuentaAlumnos(alumnos.lista);
	}
	
	public static void cuentaAlumnos(String lista){
		int posInicial=0;
		int posFinal=0;
		String nAlumnos="";
		int alumnos=0;
		int totalAlumnos=0;
		
		for(int i=0;i<lista.length();i++){
			int posicion = i;
			char caracter = lista.charAt(i);
				if (caracter == 'a'){
					posFinal=posicion-2;
						for(int j=posFinal;lista.charAt(j)!=';';j--){
							posInicial=j;							
						}		
					nAlumnos = lista.substring(posInicial,posFinal+1);
					alumnos = Integer.parseInt(nAlumnos);
					totalAlumnos=totalAlumnos+alumnos;
				}
		}
		System.out.println("totalAlumnos= " +totalAlumnos);
	}		
}
