package com.engineer.sequence;

import java.util.Scanner;

public class SequenceController {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//SequenceBean seq = new SequenceBean(); /*생성자는 객체가 생성될때 단 한번 호출되어(while 밖에 만드는 이유) 객체의 구조를 인식하게 하고 생성되는 객체의 멤버변수를 초기화하는데 목적을 둔 것.*/
	SequenceBean seq = null;
	SequenceService service = new SequenceServiceImpl();
	while (true) {
		System.out.println("[메뉴] 0.종료 1.등차수열 2.스위치수열 3. 4.");
		
		switch(scanner.nextInt()) {
			case 0: System.out.println("종료되었습니다.");
			return;
			case 1:
				seq = new SequenceBean();
				System.out.println("시작값을 입력하세요.");
				seq.setInitNum(scanner.nextInt());
				System.out.println("끝값을 입력하세요.");
				seq.setLimitNum(scanner.nextInt());
				System.out.println(service.calcArithmetic(seq));
				break;
			case 2:
				
				break;
		}
	}
}
}
