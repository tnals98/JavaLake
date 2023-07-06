package com_08.oop.interfacepkg.music;

public class Stage {
	public static void main(String[]args) {
		Musician musician = new Musician();
		musician.play(new Drum());
		musician.play(new Piano());
		musician.play(new Guitar());
	}
}
