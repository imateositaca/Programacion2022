package examen7505JOLMOS;

import java.util.Scanner;

public class Examen {
	static Scanner sc = new Scanner(System.in);
	
	//generarClaves
	static String id;
	static boolean respuesta;
	
	//cuentaVocales
	static String frase;
	static int[] vocales= new int[5];
	
	//cuentaPalabras
	static String frasep;
	static int nump;	
	
	//imprimeVertical
	static String frasei;
	
	static int opcion=0;
	
	public static void main(String[]args) {
		System.out.println("Elie que hacer:\n1.generar clave\n2.-contar vocales\n3.-contar palabras\n4.-imprimir en vertical");
		opcion=sc.nextInt();
		switch(opcion) {
		case 1:{
			generaClave(id);
		}
		case 2:{
			cuentaVocales(frase);
		}
		case 3:{
			cuentaPalabras(frasep);
		}
		case 4:{
			imprimeVertical(frasei);
		}
		}
	}

	
	
	public static boolean generaClave(String id) {
		System.out.println("Introduce numero id");
		id=sc.nextLine();
		int numero=0;
		char num;
		char[] cadena = id.toCharArray();
		for (int i=0;i<cadena.length-1; i++) {
			num=cadena[i];
			numero=numero*10+Character.getNumericValue(num);
		}
		char letra=cadena[8];
		String letras="TWRAGZYFPDXBNJMSQVHLCKE";
		char[] compL=letras.toCharArray();
		int respL=numero%23;
		if(compL[respL-1]==letra) {
			respuesta=true;
		}
		else {
			respuesta=false;
		}
		System.out.println(respuesta);
		return respuesta;
	}
	public static int[] cuentaVocales(String frase) {
		System.out.println("Introduce la frase");
		frase=sc.nextLine();
		char[] cadena= frase.toCharArray();
		for(int i=0;i<cadena.length;i++) {
			if(cadena[i]=='a') {
				vocales[0]++;
			}
			else if(cadena[i]=='e') {
				vocales[1]++;
			}
			else if(cadena[i]=='i') {
				vocales[2]++;
			}
			else if(cadena[i]=='o') {
				vocales[3]++;
			}
			else if(cadena[i]=='u') {
				vocales[4]++;
			}
		}
		System.out.println("A: "+vocales[0]+". E: "+vocales[1]+". I: "+vocales[2]+". O: "+vocales[3]+". U: "+vocales[4]);
		return vocales;
	}
	public static int cuentaPalabras(String frasep) {
		System.out.println("Introduce la frase");
		frasep=sc.nextLine();
		frasep=frasep.replaceAll("\\s{2,}"," ");
		int npalabras=0;
		char[] cadena= frasep.toCharArray();
		for(int i=0; i<cadena.length;i++) {
			if(cadena[i]==' ') {
				npalabras++;
			}
		}
		nump=npalabras+1;
		return nump;
	}
	public static void imprimeVertical(String frasei) {
		
		System.out.println("Introduce la frase");
		frasep=sc.nextLine();
		frasep=frasep.replaceAll("\\s{2,}"," ");
		int npalabras=0;
		char[] cadena= frasep.toCharArray();
		for(int i=0; i<cadena.length;i++) {
			if(cadena[i]==' ') {
				npalabras++;
			}
		}
		npalabras=npalabras+1;
		int [][] invertida=new int[npalabras][100];
		int j=0;
		for(int i=0; i<cadena.length;i++) {
			if(cadena[i]!=' ') {
				invertida[j][i]=cadena[i];
			}
			else if(cadena[i]==' ') {
				j++;
			}
		}
		for(int i=0; i<invertida.length;i++) {
			for (int k =0; k<invertida[i].length; k++) {
				if(invertida[i][k]!=0) {
					System.out.println((char)invertida[i][k]);
				}
			}
		}
	}
}
