package com_10.collection.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicFunction {
	List<Music> mList;

	public MusicFunction() {
		mList = new ArrayList<Music>();
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.println("메뉴 선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}

	public void lastPlus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		System.out.println("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		mList.add(music);

	}

	public void firstPlus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		System.out.println("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		mList.add(0, music);
	}

	public void allMusic() {
		for (int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.printf("%d번째 노래 - > 곡명 : %s, 가수명 : %s\n", (i + 1), music.getTitle(), music.getSinger());
		}

	}

	public void searchMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 곡 입력 : ");
		String title = sc.nextLine();
		for (Music music : mList) {
			if (music.getTitle().equals(title)) {
				System.out.printf("검색 결과 >> 곡명 : %s, 가수명 : %s\n", music.getTitle(), music.getSinger());
				break; // 찾았으면 그만 나와
			}
		}

	}

	public void removeMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 곡 입력 : ");
		String title = sc.nextLine();
		for (int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if (music.getTitle().equals(title)) {
				// mList에서 삭제
				mList.remove(i);
				break; // 삭제했으면 그만 나와
			}
		}
	}

	public void modifyMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 곡 입력 : ");
		String title = sc.nextLine();
		System.out.print("수정할 정보 입력(곡명) : ");
		String modTitle = sc.nextLine();
		System.out.print("수정할 정보 입력(가수명) : ");
		String modSinger = sc.nextLine();
		Music modMusic = new Music(modTitle, modSinger);
		for (int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if (music.getTitle().equals(title)) {
				mList.set(i, modMusic);
			}
		}
	}
}
