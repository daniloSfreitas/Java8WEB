package unidade4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesApp {

	public static void main(String[] args) throws Exception {
		Properties sites = new Properties();
		sites.loadFromXML(new FileInputStream("/home/paulo/Downloads/ABC Curso/2Disciplina/src/unidade4/sites.xml"));
		System.out.println(sites.getProperty("3"));

	}

}
