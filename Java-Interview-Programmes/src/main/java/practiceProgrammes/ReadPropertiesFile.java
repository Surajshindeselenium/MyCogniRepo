package practiceProgrammes;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("test.properties");
		Properties prop = new Properties();
		prop.load(reader);
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("password"));

	}

}
