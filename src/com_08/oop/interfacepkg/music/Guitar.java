package com_08.oop.interfacepkg.music;

public class Guitar implements Instrument{

	@Override
	public void tunning() {
		System.out.println("지지지잉ㅇㅇ");
	}
	
	@Override
	public void playInstrument() {
		System.out.println("ㅇㅇ잉지지지");
	}
}
