package ActividadEntornos;

import java.util.Random;
import java.util.Scanner;

public class Actividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Actividad: Gestión de repositorios en GitHub y desarrollo de una aplicación en Java");
		System.out.println("By Santi Corrales, Eric Galatanu, Quim Pueyo");
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		
		int [] [] matriz = new int [5] [5];
		
		
		// Rellenar la matriz dinamica con numeros aleatorios del 1-10
		
				for(int i = 0; i < matriz.length; i++) {
					for(int j = 0; j < matriz[i].length; j++) {
						matriz[i] [j] = random.nextInt(100) + 1;
					}
				}
				
				// Recorrer matriz y mostrar todos los elementos
				
				for(int i = 0; i < matriz.length; i++) {
					for(int j = 0; j < matriz[i].length; j++) {
						System.out.print(matriz[i][j] + " ");
					}
					System.out.println(" ");
				}
		
		
	}

}
