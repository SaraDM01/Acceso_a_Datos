/*Escribe un programa en Java que lea el fichero datos.txt y los guarde en otro fichero llamado tarjetas.txt con los datos de los clientes formateados de la siguiente forma:


Nombre: Jose María
Apellidos: Terrer Navarro
Fecha nacimiento: 02/05/1998
Teléfono: 654783433

Nombre: Pilar
Apellidos: Bayona Pérez
Fecha de nacimiento: 20/02/1972
Teléfono: 976585669*/

package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_datos {

	public static void main(String[] args) {
		
		//donde se encuntra el fichero a leer y donde crear el nuevo
		
		File mifichero = new File ("src\\ejercicios\\datos.txt");
		File fichero_tarjetas = new File ("src\\ejercicios\\tarjetas.txt");
		
		//leer fichero datos.txt
		
		try {
			
			FileReader lector = new FileReader(mifichero);
			
			BufferedReader cestaTemporal = new BufferedReader(lector);
			String linea = cestaTemporal.readLine();
			
			//Escribir fichero tarjetas.txt
			
			FileWriter escritor = new FileWriter(fichero_tarjetas, true);
			
			InputStreamReader ir= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String Linea = br.readLine();
			
			escritor.write(Linea);
			escritor.close();
			
			br.close();
			ir.close();
			
			//Separar los datos a partir de las comas
			
			while (linea != null) {

				String[]datos =linea.split(",");
				
				linea = cestaTemporal.readLine();
			}
			
			
			
			cestaTemporal.close();
			
			
	} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
	}

}


