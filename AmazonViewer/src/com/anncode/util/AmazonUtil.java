package com.anncode.util;

import java.util.Scanner;

/**
 * 
 * AMAZONUTIL
 * Permite ingresar datos por consola
 * 
 * <p>
 * Cuando se ingresa la informaci�n, valida que el dato ingresado sea de 0 a 6 
 * usando el m�todo {@code validateUserResponseMenu()}
 * 
 * @author c.can.castillo
 * @since 2021
 * @version 1.1
 * */

public class AmazonUtil {
	
	/**
	 * El m�todo {@code validateUserResponseMenu()} de la clase {@link AmazonUtil} recibe 
	 * dos par�metros
	 * @param min el valor minimo de tipo {@code int}
	 * @param max el valor maximo de tipo {@code int}
	 * @return retorna un valor entero
	 * */
	
	public static int validateUserResponseMenu(int min, int max) {
		//Leer la respuesta del usuario
		Scanner sc = new Scanner(System.in);
		
		//Validar respuesta int
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("No ingresaste una opción válida1");
			System.out.println("Intenta otra vez1");
		}
		
		int response = sc.nextInt();
		
		//Validar rango de respuesta
		while(response < min || response > max) {
			//Solicitar de nuevo la respuesta
			System.out.println("No ingresaste una opción válida");
			System.out.println("Intenta otra vez");
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("No ingresaste una opción válida");
				System.out.println("Intenta otra vez");
			}
			response = sc.nextInt();
		}
		System.out.println("Tu Respuesta fue: " + response + "\n");
		return response;
	}

}
