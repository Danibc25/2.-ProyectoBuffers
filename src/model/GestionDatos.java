package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestionDatos {

	public GestionDatos() {

	}

	//TODO: Implementa una funci�n para abrir ficheros
	
	//TODO: Implementa una funci�n para cerrar ficheros
	
	public static boolean compararContenido (String fichero1, String fichero2) throws IOException{
		//TODO: Implementa la funci�n
		
		try {
			
			File fl1 = new File("pilila.txt"); 
			
			if(fl1.exists()) {
				System.out.println("aqui esta");
				if(fl1.canRead()) {
					System.out.println("Se puede leer");
				}else {
					System.out.println("FUCK");
				};
			}else {
				System.out.println("FUCKKKKK");
			}
			
			
			FileReader f1 = new FileReader(fichero1);
			FileReader f2 = new FileReader(fichero2);
			BufferedReader br1 = new BufferedReader(f1);
			BufferedReader br2 = new BufferedReader(f2);
			
			
			String str;
			while((str=br1.readLine()) != null) {
				System.out.println(str);
				
			}
		}catch (IOException e){
				
			System.out.println(fichero1);
				
				e.printStackTrace();
			

		}
			
			
			
		
		
		return true;
	}
	
	public int buscarPalabra (String fichero1, String palabra, boolean primera_aparicion){
		//TODO: Implementa la funci�n
		return 1;
	}	

}
