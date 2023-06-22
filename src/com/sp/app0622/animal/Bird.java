package com.sp.app0622.animal;

public class Bird {
	/*
	 * 메서드나 변수는 직관성이 있어야 하므로, 개발시 신중하게 고려해야 한다.
	 * 하지만 개발을 하다보면, 로직이 상당히 흡사함에도 불구하고, 프로그램의 원칙 상 
	 * 메서드명 중복 불가라는 이유 때문에 힘들게 정해놓은 메서드 명을 재사용할 수 없는 일이 발생한다.
	 * 이러한 문제를 해결하기 위해 java에서는 OverLoading 을 지원해준다.
	 * OverLoading 이란, 하나의 클래스 내에 메서드 명을 중복 정의할 수 있는 메서드 정의 기법을 말하는데,
	 * 이때 주의할 점은 메서드의 이름은 같게 하고 해당 메서드의 매개 변수의 자료형이나 개수는 틀리게 해야 한다.
	 * 그래야 구분이 가능하다.
	 * */
	public void fly() {
		System.out.println("새가 난다");
	}
	
	public void fly(int level) {
		System.out.println("새가 낮게 난다");
	}
	
	public void fly(int level, int k) {
		System.out.println("새가 낮게 난다");
	}
}
