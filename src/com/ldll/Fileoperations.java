package com.ldll;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileoperations {

	public void simplefilewriter(String path) {
		try {
			FileWriter writer = new FileWriter(path);
			for (int i = 1; i <= 1000; i++) {
				if (i % 2 == 0) {
					int x = i * 10;
					writer.write(x + "\n");
				} else {
					int y = 2 * i;
					writer.write(y + "\n");
				}
			}
			writer.close();
		} catch (IOException ex1) {
			System.out.println("IO Exception");
		}
	}

	public linkedlist linkedlistwriter(String path, linkedlist obj) {
		try {
			File file = new File(path);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextInt()) {
				int x = scanner.nextInt();
				obj.addLast(x);
			}
			if (scanner != null)
				scanner.close();
		} catch (FileNotFoundException ex1) {
			System.out.println("File not found");
		}
		return obj;
	}

	public void fileoutputwriter(String path, Node head) {
		try {
			FileWriter writer = new FileWriter(path);
			Node curr = head;
			while (curr != null) {
				writer.write(curr.data + "\n");
				curr = curr.next;
			}
			writer.close();
		} catch (IOException ex1) {
			System.out.println("IO Exception");
		}
	}

}
