package ejercicio18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Ejercicio18 {

	private int tamagnoRegistro = 154; // 4 int + (25 char)*2 + (50 char)*2 = 4 + 50 +100 = 154 
	public static void main(String[] args) {
		ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
		Departamento d1 = new Departamento(101, "Matematicas" , "Zaragoza");
		listaDepartamentos.add(d1);
		Departamento d2 = new Departamento(98, "Física" , "Zaragoza");
		listaDepartamentos.add(d2);
		Departamento d3 = new Departamento(2, "Inglés" , "Huesca");
		listaDepartamentos.add(d3);
		Departamento d4 = new Departamento(213, "Física" , "Teruel");
		listaDepartamentos.add(d4);
		
		//defino el fichero donde voy a escribir
		
		RandomAccessFile fichero = null;
		
		try {
			
		fichero = new RandomAccessFile("src\\ejercicio18\\departamentos.dat" , "rw");
		
		}catch(FileNotFoundException e) {
			
			System.err.println("No existe el fichero");
			e.printStackTrace();
		}
		
		//escribir un departamento
		//colocar el cursos donde voy a empezar a escribir
		
		for (Departamento d :listaDepartamentos){
		
			try {
		
			//escribo el numero del departamento
				fichero.writeInt(funcion(d.getNumero()));
			//escribo el nombre del departamento
				fichero.writeChars(d.getNombre());
			//escribo la localidad
				fichero.writeChars(d.getLocalidad());
		
			}catch(IOException e) {
			
				e.printStackTrace();
		}
		
		}
		
		try {
			fichero.close();
		}catch (IOException e) {
			
			e.printStackTrace();
	}
		private static int funcion(int numero) {
			int pos = 0;
			pos = tamagnoRegirstro * (numero - 1) + 1;
			return pos;
		}
	
	}	
}
