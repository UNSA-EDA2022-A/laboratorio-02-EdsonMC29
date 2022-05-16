package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println("Es cuadrado perfecto " + n + "? " + obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int numero) {

		int temp= numero;
		boolean cuadrado = false;
		int divisor = 2;
			
		//Forma iterativa y no recursiva
	        while(temp != 1) {
	            if(temp % divisor == 0){ //Factoriza el numero todos los 2
	                System.out.print(divisor + " ");

	                temp = temp / divisor;
	                if(temp * temp == numero) // verifica si se encontro que es cuadrado perfecto 
	                	cuadrado = true;
	            }
	            else {       
	                divisor++;     // Factoriza ahora con los numeros siguientes
	            }
	        }
		return cuadrado;
	}
}
