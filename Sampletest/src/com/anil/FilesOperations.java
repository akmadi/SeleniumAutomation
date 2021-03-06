package com.anil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FilesOperations {

	public static void main(String[] args) {

		fileWriter();

		fileReader();

	}

	/**
	 * 
	 */
	private static void fileReader() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void fileWriter() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("This is my first text file");

			writer.write("\nThis is my second line");

			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
