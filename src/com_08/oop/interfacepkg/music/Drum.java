package com_08.oop.interfacepkg.music;

public class Drum implements Instrument{
	
	@Override
	public void tunning() {
		System.out.println("둥두두두욷");
	}
	
	@Override
	public void playInstrument() {
		System.out.println("둥둥둥");
	}
}
