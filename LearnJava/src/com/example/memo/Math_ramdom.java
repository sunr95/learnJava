package com.example.memo;

public class Math_ramdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int theNum = (int)(Math.random()*100+1);
		//Math.random() : 0~1 내 실수의 램덤 만들기 때문에 타입이 안맞아서 오류됨
		//1~100으로 만들고자 한다면 *100와 +1을 함
		//이때, 괄호를 해야함 (int)(Math.random()*100+1);
		// 이유 : (int)Math.random()*100+1 = 램덤수를 int로 만드는 것을 우선 작업함으로 1이 된다(0*100+1)

		System.out.println(theNum);
	}

}
