package com_10.collection.list;

public class ObjectList {
//	int [] nums;
	Object [] objects;
	int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}

	public void add(Object input) {
		objects[size] = input;
		size++;
	}
	
	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
	
	
}
