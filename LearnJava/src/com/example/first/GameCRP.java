package com.example.first;

import java.util.Scanner;

public class GameCRP {

	public static void main(String[] args) {
		// TODO 가위바위보
		// 5판 3선승제

		int crp = (int)(((Math.random()*100)+1)%3);
		String com = "";
		int cou;
		String use;
		int win = 0;

		Scanner read = new Scanner(System.in);

		switch(crp) {
		case 0 :
			com = "가위";
			break;
		case 1 :
			com = "바위";
			break;
		case 2 :
			com = "보";
			break;
		}//switch

		for(int i = 0; i <= 5 ; i++) {
			System.out.println("(0)가위 (1)바위 (2)보 중 하나를 내시오");
			int num = read.nextInt();

			switch(num) {
			case 0 :
				use = "가위";
			case 1 :
				use = "바위";
			case 2 :
				use = "보";

				if(Math.abs(crp-num) == 1 && crp > num) {
					System.out.println("컴퓨터 : " + com);
					System.out.println("사용자 : " + use);
					System.out.println("졌습니다");
				}else if(crp-num <= 1 && crp < num){
					System.out.println("컴퓨터 : " + com);
					System.out.println("사용자 : " + use);
					System.out.println("졌습니다");
				}else if(crp == num){
					System.out.println("컴퓨터 : " + com);
					System.out.println("사용자 : " + use);
					System.out.println("무승부입니다, 다시!");
				}else if(crp-num > 1){
					System.out.println("컴퓨터 : " + com);
					System.out.println("사용자 : " + use);
					System.out.println("이겼습니다");
				}

			}//if



		}//while

	}

}
