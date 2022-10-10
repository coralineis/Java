package Chap17;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("エラーです");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				;
			}
		}
	}
}
