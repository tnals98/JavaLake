package com_10.collection.music;

import java.util.Scanner;

public class MusicRun {
	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		end: while (true) {
			int value = mFunc.printMenu();
			switch (value) {
			case 1:
				mFunc.lastPlus();
				break;
			case 2:
				mFunc.firstPlus();
				break;
			case 3:
				mFunc.allMusic();
				break;
			case 4:
				mFunc.searchMusic();
				break;
			case 5:
				mFunc.removeMusic();
				break;
			case 6:
				mFunc.modifyMusic();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				break end;
			}

		}
	}
}
