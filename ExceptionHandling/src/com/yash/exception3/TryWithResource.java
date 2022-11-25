package com.yash.exception3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\om.gadewar\\Desktop\\Text";
		readFirstLineFromFile(path);
	}

	static String readFirstLineFromFile(String path) throws IOException {
		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
			return br.readLine();
		}
	}

}
