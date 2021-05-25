package com.example.homework;

import java.util.Scanner;

public class Programiz_Intro {

	public static void main(String[] args) {
		/* 	1 : 스캔 - 사용자에게 직접 입력을 받고자 할때
				 import java.util.Scanner;
				 Scanner reader = new Scanner(System.in);
			 	 int number = reader.nextInt();  <<정수로 받고자 할때int
			2 : 정수 = int
			3 : 소숫점 수 = float (단, 이때 수 뒤엔 반드시 f가 붙어야함)
				 float = 2.5f;
			4 : 아스키 코드 값 찾기 (EZ : 문자의 숫자 값)
				 *)문자열 선언=""<,>문자 선언=''
					String str = "문자열" , char ch = '문자' <<!대소구분
				 형식 1 : int ascii = ch;  <<char ch = 'a';선언 후
				 형식 2 : int cast = (int)ch; <<char ch = 'a';선언 후
			5 : 몫과 나머지
				 몫 = "/" : int quotient = dividend / divisor; <<int로 두 수 선언 후
				 나머지 = "%" : int remainder = dividend % divisor; <<int로 두 수 선언 후
			6 : 임시 변수를 사용하여 두 숫자 바꾸기
				 EZ)저장 공간을 하나 추가로 만들어서 이동 이동
				 방법1-요령) t=f / f=s / s=t 와 같은 방식으로 이동
				 방법2-임시없이) f=f-s / s=f+s / f=s-f 와 같은 방식...<<왜이래...
			7 : 홀짝 구분 방법 : 2로 나눠 나머지가 나오면 홀수
				 방법1 : %와 if-else구문 사용\
				 방법2 : 삼항연산자 = (조건) ? true:flse
			8 : 알파벳 모음 자음 구분
				 방법1 : if-else구문
				 방법2 : switch-case -- break; default:
				 *)여기서 디폴트란?
				  디폴트 default 
					명사 정보·통신 응용 프로그램에서 사용자가 특별히 명령을 내리지 않으면
					시스템이 자동으로 적용하는 미리 정해진 값이나 조건.(즉, 초기값 지정)
			9 : if..else 문으로 큰수 찾기
				 (조건) : if( n1 >= n2 && n1 >= n3)...
WTF			10 : 근의 공식 : 쓴들 이해할까... 근의공식이 뭐였드라
				 *)x2 + bx + c = 0
				   x = (-b ± √(b2-4ac)) / (2a)
				 *)double root1, root2;
				   double determinant = b * b - 4 * a * c;
    				// check if determinant is greater than 0
				   if (determinant > 0) {
			      	// two real and distinct roots
				     root1 = (-b + Math.sqrt(determinant)) / (2 * a);
				     root2 = (-b - Math.sqrt(determinant)) / (2 * a);
				   System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
				  	...
?			11 : 윤년을 확인 : 윤년의 개념...4년에 한번 - if의 중첩 -길다 아래에서 확인하라
?			12 : if else(if의 중첩과는 다르다!)의 이용
?			13 : 알파벳 구분
				  *)if else 조건 : and 와 or((&&)||(&&))
				   if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) <<ASCII를 이용한 조건. 알파벳
				  *)삼항 연산자 조건 : and 와 or((&&)||(&&))
				   String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ? "알파벳" : "아님";
				  *)클래스 isAlphabetic()
				   if (Character.isAlphabetic(c)) {...
			11 : 캐릭터의 빈도 찾기 (요소 : ~.length(~) / ~.charAt(~))
				  *) for = for(초기값(숫자);종료조건;증감값)
			12 : 문자열에서 모든 공백을 제거
				  *)요소 : .nextLine(); / .replaceAll("\\s", "");
			13 : 반올림하는 법 - plint format과 ("%f" 외 float 등의 의미)\
			14 : 문자열이 비여있는지 확인하기
		*/
		
		//예제 쓰기
		//Intro : 4. 문자의 ASCII 값 찾기
		/*
		char ch = 'a';
			//형식1
		int ascii = ch;
			//형식2
		int cast = (int)ch; // 위의 형식1이 된다면 (강제형식 변환)는 굳이 왜 쓰나 !)그래서 실무에선 굳이 쓰지 않음
		
		System.out.println(ch + "의 아스키 값 : " + ascii + " " + cast); //값 97 97
	System.out.println(ascii + cast); //값 194 !)int+int이기 때문에 '+'='add'의 의미로 쓰임
		*/
		
		//Intro : 5. 몫 및 나머지 계산
		/*
		int dd = 25, ds = 4;
		int quo = dd / ds;
		int rem = dd % ds;
		System.out.println(quo +" and "+ rem);
				
		int dd = 25, ds = 4;
???		float quo = dd / ds; // 어떻게 하더라..?;; "?%d?"
		int rem = dd % ds;
~?~		System.out.printf(quo +" and "+ rem); //값 6.0 and 1 <<6.25..
		*/
		
		//Intro : 6. 임시 변수를 사용하여 두 숫자 바꾸기
		/*
		float fir = 1.9f , sec = 9.1f;
		float temporary = fir;
		fir = sec;  //앞서 타입 선언, 때문에 타입은 생략
		sec = temporary;
		System.out.println(fir + " " + sec); // 값 9.1 1.9
		*/
		
		//Intro : 7. 숫자가 짝수인지 홀수인지 확인
		/* 
		 * if ... else 문을 사용
		import java.util.Scanner; //main 밖에 쓰여 있어야함.
		Scanner read = new Scanner(System.in);
		System.out.println("자연수를 입력하시오");
		int num = read.nextInt();
		
		if(num % 2 ==0) 
			System.out.println(num + "은(는) 짝수");
		else 
			System.out.println(num + "은(는) 홀수");
WTF : if 구문 {}필요 없었나 //중복 등에 쓰임 아래 참조
		
삼항	* 삼항 연산자 사용 : [(조건) ? 참:거짓]
		Scanner read = new Scanner(System.in);
		System.out.println("자연수를 입력하시오");
		int num = read.nextInt();
		
		String evenOdd = (num % 2 ==0) ? "even" : "odd";
		System.out.println(num + "은(는) " + evenOdd);
		*/
		
		//Intro : 8. 알파벳 모음 자음 구분
		/*
		 *  if 구문
		char ch = 'i';
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') //"값-등호 부등호 등 조건과 관련 될 경우" = '==외' <,> "선언"의 개념 '=' // '||'=or
			System.out.println(ch + "은(는) 모음");
		else
			System.out.println(ch + "은(는) 자음");
		
		* switch 
???		char ch = 'd';
		switch (ch) {
			case 'a' : //!) : 을  꼭 기억하자 // case 숫자 = "case 1" 과 같이 씀
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				System.out.println(ch + "은(는) 모음");
				break; //!) 반드시 끝에 넣어줘야 한다
			default: //summary 보세여
				System.out.println(ch + "은(는) 자음");
		}//switch
		
		***)
		switch (area) {
			case 'i' :
			case 'o' :
				System.out.println(ch + "은(는) 모음");
				break;
			case 'o' :
			case 'u' :
				System.out.println(ch + "은(는) 모음");
				break;
			default:
				System.out.println(ch + "은(는) 자음");
		}//switch
		*/		
		
		//Intro : 11.윤년을 확인 <<알듯 말듯
		/*
?		int year = 1996;
		boolean leap = false; // boolean은 기본값을 설정 해야한다,(기본 값은 False만 설정 해야함)
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0)
					 //4와 100과 400으로 나눠 떨어질 때 참
					leap = true;
				else //4와 100으로만 나눠 떨어질때 거짓
					leap = false;   // 초기값을 설정했기 때문에, {공백}으로 뒤도 됨
									// leap(메소드(sysout...등));의 경우 쓰는거임;
			}else
				leap = true; //4로만 나눠지면 참
		}else
			leap = false; //4로 나눠지지 않음 거짓
		
		if(leap)
			System.out.println(year + "은 윤년입니다");
		else
			System.out.println(year + "은 윤년이 아닙니다");
				
			}//if-위치 잘보세영
		*/
		
		//Intro : 13. 알파벳을 확인 -(3)isAlphabetic () 메소드를 사용
		/*
?		Scanner read = new Scanner(System.in);
		System.out.println("입력하시오");
		//String이란 메소드를 char로 바꾸는 방법
		String st = read.next();  // !)입력은 char로 못받음 
		char ch = st.charAt(0);   // !)String을 char로 받는 법 //st=read.next()
		
		***)
		char area;
		Scanner...
		area = read.next().charAt(0);
		
		if(Character.isAlphabetic(ch)) { : Character만 되나봄
		System.out.println("알파벳");
		}//if
		
		char ch = 'a';
		if (Character.isAlphabetic(ch)) {
			System.out.println("알파벳");
		}//if
		else {
			System.out.println("아님");
		}//else
		*/

		//Intro : 11. 문자열에서 문자의 빈도
		/*
		String st = "This website is awesome.";
		char ch = 'e';
		int frequency = 0;
		
		for(int i = 0; i < st.length(); i++) {   // 0부터 시작해서 한번 돌아 올라오면 +1증가
			if(ch == st.charAt(i)) {
				++frequency;  //"++" = "+1"의 의미
			}//if
		}//for
		System.out.println("e는 " + frequency + "개 입니다."); //"e"는~ 이라는 문장은 못쓰나
		*/
		
		//Intro : 12. 공백 제거
		/*
		Scanner read = new Scanner(System.in);
		System.out.println("문장을 적으시오");
		String str = read.nextLine();  //문자열=next(단어)와 nextLine(문장)의 차이;
		
		str = str.replaceAll("\\s", "");
		System.out.println("수정된 문장은 : " + str + "입니다");
		*/
				
		//Intro : 13.숫자 반올림
		/*
		double num = 1.23456;
		System.out.printf("3자리 반올림 값은" + "%.3f" + "입니다",num);
		*/
		// create null, empty, and regular strings
	    
		
		//???힘들어
		String str1 = null;
	    String str2 = "";
	    String str3 = "  ";

	    // isNullEmpty : 지정된 문자열이 null이거나 빈 문자열("")인지를 나타냅니다.
	    //  *) public static bool IsNullOrEmpty (string? value);
	    System.out.println("str1 is " + isNullEmpty(str1));

	    // check if str2 is null or empty
	    System.out.println("str2 is " + isNullEmpty(str2));

	    // check if str3 is null or empty
	    System.out.println("str3 is " + isNullEmpty(str3));
	  }

	  // method check if string is null or empty
	  public static String isNullEmpty(String str) {

	    // check if string is null
	    if (str == null) {
	      return "NULL";
	    }

	    // check if string is empty
	    else if(str.isEmpty()){
	      return "EMPTY";
	    }

	    else {
	      return "neither NULL nor EMPTY";
	    }
		
	}//end of main git

}//end of class
	
