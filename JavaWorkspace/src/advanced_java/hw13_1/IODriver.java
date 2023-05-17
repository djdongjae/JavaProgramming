package advanced_java.hw13_1;

//***************************
//파일명: IODriver.java
//작성자: 201914089 오동재
//작성일: 2023-05-16
//내용: hw3_1
//***************************

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IODriver {
	public static void main(String[] args) {
		System.out.println("hw13_1 오동재");
		
		String inputFilePath = "c:\\java\\input.txt";
		String outputFilePath = "c:\\java\\output.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
				PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))) {
			int character;
			while ((character = reader.read()) != -1) {
				char convertedChar = Character.toUpperCase((char) character);
				System.out.print(convertedChar);
				writer.print(convertedChar);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
