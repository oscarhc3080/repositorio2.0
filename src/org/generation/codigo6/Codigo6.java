package org.generation.codigo6;

import java.util.Scanner;

public class Codigo6 {
	
	public static void main(String[] args) {

		int[] n = new int[20];

	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " ");
	    }
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    
	    int opcion = Integer.parseInt(scanner.nextLine());

	    int multiplo = (opcion == 1) ? 5 : 7;

	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.println("[" + e + "] ");
	      } else {
	        System.out.println(e + " ");
	      }
	    }
	  scanner.close();
	    }
	}

