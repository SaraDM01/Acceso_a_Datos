

		/*Escribe un programa Java que pida una serie de frases por teclado hasta que se inserte como
		frase la palabra “fin”. Dichas frases deberán guardarse en un fichero de texto. A continuación,
		el programa visualizará el contenido del fichero, frase por frase. Cada vez que se ejecute el
		programa, se tienen que descartar las frases que ya estaban escritas en el fichero. Realiza este
		ejercicio sin usar la clase BufferedReader.
		*/


package Ejercicio4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		ejercicio4 ej4 = new Ejercicio4();
		File mifichero = new File ("tmp.txt");
		if (!mifichero.exists()) {
			ej4.escribir(mifichero, "");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce frases hasta la linea \"fin\"");
		String frase = sc.nextLine();
		While (!frase.equals("fin")){
			
			if (!ej4.enFIchero2(mifichero, frase)) {
				ej4.escribir(mifichero, frase);
			}else {
				System.out.println("La frase ya está en el fichero");
			}
			
			frase =sc.nextLine();
		}
			ej4.leerFichero(mifichero);
	}
	
	
	//leer linea
	private String leerLinea (FileReader lector);
	int caracter = lector.read();
	if(caracter < 0 ) return null;
	String cadena = "";
	while(caracter != '\n') {
		cadena=cadena + (char)caracter;
		caracter = lector.read();
	}
	return cadena;
	
	
	//dupilcado
 private boolean enFichero2(File mifichero, String frase) {
	 FileReader lector;
	 try {
		 lector= new FileReader(mifichero);
		 String linea= leerLinea(lector);
		 while(linea =!null) {
			 if(linea.equals (frase)) return true;
			 linea =leerLinea(lector);
		 }
		 
		 lector.close();
	 }catch(FileNotFoundEsception e) {
		 e.printStackTrace();
	 }catch (IOException e) {
		 e.printStackTrace();
	 }
	 return false;
 }
}
