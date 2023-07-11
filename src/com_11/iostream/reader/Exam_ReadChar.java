package com_11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;

		try {
			reader = new FileReader("src/com_11/iostream/reading.txt");
			int readCharCount;
			char[] cBuf = new char[3];
//			int i = 0;
			String result = "";
			while (true) {
				readCharCount = reader.read(cBuf);
//				System.out.println(readCharCount);
				if (readCharCount == -1)
					break;
				result += new String(cBuf, 0, readCharCount);
//				for(char c : cBuf) {
//					System.out.print(c);
//				}
//				System.out.println();
//				i++;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
