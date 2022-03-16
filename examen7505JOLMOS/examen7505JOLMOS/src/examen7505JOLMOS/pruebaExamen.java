package examen7505JOLMOS;

import java.util.Scanner;

public class pruebaExamen {
	static int n=0;
	static String nombre = "Jorge";
	static String apellido = "Olmos";
	static String dni = "73168537V";
	static String mail = "7505jolmos@e-itaca.es";
	static Scanner sc = new Scanner(System.in);
	static int opcion=0;
	public static void main(String[] args) {
		if(n==0) {grabarDatos();}
		System.out.println("1.-Grabar persona");
		opcion=sc.nextInt();
		switch(opcion) {
		case 1:{
			System.out.println("Introduce el nombre");
			nombre=sc.nextLine();
			System.out.println("Introduce el apellido");
			apellido=sc.nextLine();
			System.out.println("Introduce el dni");
			dni=sc.nextLine();
			System.out.println("Introduce el mail");
			mail=sc.nextLine();
			grabarDatos();
		}
		}
		
		
		
	}
	public static void grabarDatos() {
		String[][] datos= new String[100][4];
		datos[n][0]= nombre;
		datos[n][1]= apellido;
		datos[n][2]= dni;
		datos[n][3]= mail;
		n++;
	}
}
