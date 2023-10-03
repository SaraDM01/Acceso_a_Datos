package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_datos {

	public static void main(String[] args) {
		
		File mifichero = new File ("D:\\Documentos\\Sara\\Acceso_a_Datos\\Workspace\\Acceso_a_Datos\\.git\\src\\ejercicios\\datos.txt");
		File fichero_tarjetas = new File ("D:\\Documentos\\Sara\\Acceso_a_Datos\\Workspace\\Acceso_a_Datos\\.git\\src\\ejercicios\\tarjetas.txt");
		
		//leer fichero datos.txt
		try {
			FileReader lector = new FileReader(mifichero);
			
			BufferedReader cestaTemporal = new BufferedReader(lector);
			String linea = cestaTemporal.readLine();
			
			while (linea != null) {
				System.out.println(linea);
				linea = cestaTemporal.readLine();
			}
			
			cestaTemporal.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//escirbir fichero tarjetas.txt

		try {
			//mifichero.createNewFile();
			FileWriter escritor = new FileWriter(fichero_tarjetas, true);
			
			InputStreamReader ir= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String linea = br.readLine();
			
			escritor.write(linea);
			escritor.close();
			
			br.close();
			ir.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}


