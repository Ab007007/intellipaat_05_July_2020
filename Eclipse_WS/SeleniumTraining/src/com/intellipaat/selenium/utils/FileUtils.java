package com.intellipaat.selenium.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {

	public static void main(String[] args) throws IOException {

		System.out.println(getPropertyValue("url"));
		System.out.println(getPropertyValue("username"));
		System.out.println(getPropertyValue("password"));
		System.out.println(getPropertyValue("timeout"));
		System.out.println(getPropertyValue("browser"));

	}

	public static String getPropertyValue(String name) {
		File file = null;
		FileInputStream fis = null;
		String value = null;
		try {
			file = new File("data/globaldata.properties");
			fis = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fis);
			value = props.getProperty(name);

		} catch (Exception ex) {
			System.out.println("Exception while reading a property file");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Returning value from props file-------------> " + value);
		return value;

	}
}
