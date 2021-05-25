package com.example.first;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		// TODO 램덤 수 지정
		/*
		 * 램덤수 지정
		 * 숫자 받기
		 * 숫자 비교 - 무한루프
		 */
		
		int theNum = -999;
		int userN = 0;
		Scanner read = new Scanner(System.in);
		theNum = (int)(Math.random()*100+1);
		
		for (int i = userN;theNum != i;i++) {
		
		System.out.println("1부터 100중 임의의 자연수를 맞춰보시오");
		userN = read.nextInt();
		
			if (theNum == userN) {
				System.out.println("정답");
				break;
				
			}else if(theNum < userN) {
				System.out.println("그 숫자보다 작아요");
			}else if(theNum > userN) {
				System.out.println("그 숫자보다 커요");
			}//if

		}//for
	System.out.println("종료");
	}//main

}//class
