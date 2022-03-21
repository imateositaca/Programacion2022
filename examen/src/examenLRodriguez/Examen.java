package examenLRodriguez;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class Examen {
	
	
	
	static String Nombre = "Lucas";
	static String PrimAp = "Rodriguez";
	static String DNI = "73159046W";
	static String email = "0222lrodriguez@e-itaca.es";
	
	
	
	
	public static void main(String[] args) {
		
		String cadena = "73159046W";
		generaClave(cadena);
		System.out.println(generaClave(cadena));
		cadena = "aaeeiioooooouu";
		cuentaVocales(cadena);
		System.out.println(cuentaVocales(cadena));
		cadena = "Soy un mal programador";
		System.out.println(cuentaPalabras(cadena));
		
	}
	
	
	public static boolean generaClave(String cadena) {
		
		char[] longitud = cadena.toCharArray();
		String cade = cadena.substring(0, 7);
		String texto = "TWRAGZYFPDXBNJMSQVHLCKE";
		char[] comparacion = texto.toCharArray();
		float temp = (Float.valueOf(cade).floatValue());
		float temp2 = 0;
		boolean dev = false;
			

			
			temp2 = temp % 23; // 
			int temp3 = (int) temp2;
			
			if (comparacion[temp3] == longitud[8]) { // compara si el resultado del resto coincide con la letra en el lugar 8 (la letra dni)
				dev = true;
			} else { // estas 2 funciones devuelven el boolean
				dev = false;
			}
		return dev;
	}
	
	public static int[] cuentaVocales (String cadena) {
		
		char[] palabra = cadena.toCharArray();
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		int[] lista = new int[5];
		for (int i = 0; i < palabra.length; i++) {
			
			if (palabra[i] == 'a') {
				contadorA++;
				
			} else
				if (palabra[i] == 'e') {
					contadorE++;
				} else
					if (palabra[i] == 'i' || palabra[i] == 'I') {
						contadorI++;
					}
					
			if (palabra[i] == 'o' || palabra[i] == 'O') {
				contadorO++;
			} else
				if (palabra[i] == 'u' || palabra[i] == 'U') {
					contadorU++;
				}
				}
		
		lista[0] = contadorA;
		lista[1] = contadorE;
		lista[2] = contadorI;
		lista[3] = contadorO;
		lista[4] = contadorU;
		
		
		
		return lista;
		
		
	}
	
	public static int cuentaPalabras(String cadena) {
		int num = 0;
		char[] temp = cadena.toCharArray();
		int temp2;
		for (int i = 0; i < cadena.length(); i++) {
			temp2 = cadena.charAt(i);
			
			if(temp2 == ' ' || i == temp.length) {
				num++;
			}
			
		}
		num++;
		
		return num;
	}
	
	public static void imprimeVertical(String cadena) {
		
		
	
	}
	

	
	

}
