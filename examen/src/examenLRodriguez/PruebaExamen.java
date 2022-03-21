package examenLRodriguez;

import java.util.Scanner;

public class PruebaExamen {
		
	
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce tus datos:");
			System.out.println("Nombre:");
			String nombre = sc.nextLine();
			System.out.println("Primer Apellido: ");
			String primerape = sc.nextLine();
			System.out.println("DNI:");
			String DNI = sc.nextLine();
			System.out.println("Correo:");
			String correo = sc.next();
			char[] temp = nombre.toCharArray();
			char[] temp2 = primerape.toCharArray();
					
			if (nombre.length() > primerape.length()) { // Todo este Lio son para hacer las cosas en vertical
				
				for (int i = 0; i < primerape.length(); i++)  // 1 caso
				{
					System.out.println(temp[i] + "  " + temp2[i]);
					}
				
				for (int i = primerape.length(); i < nombre.length(); i++) {
						
					System.out.println( temp[i] + "\n");
					}
					
					
					
					
					
			} else if (nombre.length() < primerape.length()) { // 2 caso, nombre mas corto que apellido
				
				for (int i = 0; i < nombre.length(); i++) {
				System.out.println(temp[i] + "  " + temp2[i]);
							}
				for (int i = nombre.length(); i<primerape.length(); i++) {
				System.out.println("  " + temp2[i]);
				} 
				}
			
					else if (nombre.length() == primerape.length()) { // tercer caso, nombre igual que el apellido
						
						for (char i : temp) {
							System.out.println(temp[i] + "  " + temp2[i] + "\n");
				}
				
				
				}

			
			if (nombre.contains(" ")){ // usamos el metodo de la otra clase
				
				System.out.println("El nombre es compuesto. El numero de palabras son:");
				
				System.out.println(Examen.cuentaPalabras(nombre));
			}
			
			if (Examen.generaClave(DNI) == false) {// usamos el metodo de la otra clase
				System.out.println("No coincide.");
				
			} else {
				System.out.println("Coincide");
			}
			
			
		}
}
