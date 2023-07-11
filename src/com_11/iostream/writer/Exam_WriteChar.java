package com_11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {
	public static void main(String[] args) {
		Writer writer = null;

		try {
			writer = new FileWriter("scr/com_11/iostream/writing2.txt");
			char[] cbuf = "I/O Stream Good".toCharArray();
			writer.write(cbuf);
			writer.flush(); // 버퍼 비우기
			System.out.println("write(char[]) 동작 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close(); // 버퍼를 비우지 않아도 스츠림을 종료하게 되면 버퍼가 비워짐
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
