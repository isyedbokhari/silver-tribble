package seleniumDay07;

import utilities.ConfigurationReader;

public class readFilesFromProperties {

	public static void main(String[] args) {
		String valueOfOurFirstCall = ConfigurationReader.getProperty("browser");
		System.out.println(valueOfOurFirstCall);
	}

}
