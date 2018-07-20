package unidade2;

import java.io.FileInputStream;

public class StreamApp {
	
	public static void byteStream() throws Exception{
		
		FileInputStream entrada = new FileInputStream("/home/paulo/Downloads/ABC Curso/2Disciplina/src/unidade2/dados.txt");
	    int contador = 0;
	    while((entrada.read()) != -1)
	    	contador++;
	System.out.println("Numero de caracters é: "+contador);
	entrada.close();
	}
	
	

	public static void main(String[] args) {
        try{  
		byteStream();	
        } catch(Exception e){
        	e.printStackTrace();
        }
		
	}

}
