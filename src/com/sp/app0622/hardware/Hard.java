package com.sp.app0622.hardware;

//컴퓨터의 부품 중 하드디스크를 정의하다
public class Hard {
	int size; //하드용량
	String type; //SSD, IDE 구분
	
	public Hard(int size, String type) {
		this.size=size;
		this.type=type;
	}
}
