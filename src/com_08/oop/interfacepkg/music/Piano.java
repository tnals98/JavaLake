package com_08.oop.interfacepkg.music;

public class Piano implements Instrument{

	@Override
	public void tunning() {
		System.out.println("도레미파솔라시도");
	}
	
	@Override
	public void playInstrument() {
		System.out.println("도시라솔파미레도~");
	}
}
