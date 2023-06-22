package com.sp.app0622.hardware;


//컴퓨터 본체를 정의한다
public class Desktop {
	//부품들을 has a 관계로 보유
	Ram ram;
	Hard hard;
	Keyboard keyboard;
	
	//데스크탑은 부품을 가지고 있으므로, 즉 초기화할 대상이 있으므로
	//생성자의 코드 작성은 필수이다.
	public Desktop() {
		this.ram=new Ram("HP");
		this.hard=new Hard(512, "SSD");
		this.keyboard=new Keyboard("앱코", 50000);
	}
	
	public static void main(String[] args) {
		//컴퓨터 본체의 인스턴스를 생성하는 시점에 해당 부품들도 메모리에 올라와야 한다.
		//데스크탑의 인스턴스 생성 이후에는 메모리의 브랜드 명, 하드의 사이즈, 키보드의 가격을 출력해야 한다.
		Desktop d=new Desktop();
		System.out.println("메모리의 브랜드는 "+d.ram.brand);
		System.out.println("하드디스크 사이즈는 "+d.hard.size);
		System.out.println("키보드의 가격은 "+d.keyboard.price);
	}
}
