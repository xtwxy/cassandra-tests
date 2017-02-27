package com.wincom.mstar;
public class Room {
	private int RoomId;
	private int type;
	public Room() {
		super();
	}
	public Room(int Serial,int type) {
		super();
		this.RoomId = Serial;
		this.type=type;
	}
	public int getRoomId() {
		return RoomId;
	}
	public void setRoomId(int RoomId) {
		this.RoomId = RoomId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
