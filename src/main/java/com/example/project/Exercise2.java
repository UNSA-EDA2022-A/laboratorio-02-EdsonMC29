package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt(), suma;
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				n = sc.nextInt();
				a[i] = n;
			}

			suma = sc.nextInt();

			System.out.println(obj.esSubconjuntoSumaExt(a, suma));
		}
	}

	public boolean esSubconjuntoSumaExt(int a[], int suma) {
		int temp = 0;
		boolean subconjunto = false;
		// Casos base
		if (suma == 0)
			subconjunto = true;
		
		for(int i= 0; i< a.length; i++) {
			if(a[i] < suma)
				temp += a[i];
			if(temp == suma)
				break;
			subconjunto = true;
		}
		if (temp != suma)
			subconjunto = false;
		
		return subconjunto;
	}
}
