package com_17.opp.motel.domain.vo;

public class Room {
	private boolean isAvailable;
	
	public Room() {}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Room [isAvailable=" + isAvailable + "]";
	}
	
}
