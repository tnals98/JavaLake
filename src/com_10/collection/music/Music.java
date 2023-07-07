package com_10.collection.music;

public class Music {
	// 가수 이름
	// 곡 이름

	private String title;
	private String singer;

	public Music() {
	}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
}
