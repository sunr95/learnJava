package com.example.first;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import : 외부에서 정의한 패키지 라이브러리를 디파인, 가져오는 것

public class GussingGUI extends JFrame {
	//갯싱 구이 클래스를 만듬 \클래스의 상속 extends : JFrame클래스를 가져와서 클래스 만듬

	private JPanel contentPane;
	private JTextField txtGuess;
	private JButton btnButtonGuess;
	private JButton btnRestrart;
	private JButton btnExit;

	private int computerNumber; //컴퓨터가 생성한 숫자 보관장소
	private JLabel lblMessage; //객체지향

	//컨테츠 패널을 만듬 선언

	/**
	 * Launch the application.
	 */
	//여기부터~
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //괄호시작 : (new ~ 패러미터 / Runnable라는 메소드가 발생
			public void run() {
				try {
					GussingGUI frame = new GussingGUI(); // 켓싱 클래스를 만들어서 프래임 만들어서
					frame.setVisible(true); //보여줘라
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); //ㅡ먀ㅜ이 실행되면  EventQueue클래스의 invokeLater메소드 실행 - 이벤트가 발생되면 발생하겠다는 것
	}//main - 특수한 메소드로서 프로그램의 시작을 알림

	/**
	 * Create the frame.
	 */
	public GussingGUI() { //생성 컨스트럭터 내
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				makeNumber(); //숫자를 만든는 메소드 호출 >> 여기 벗어난 곳에 만들ㄹ예정
			}
		}); // new GussingGUI()의 생성자 - 내가 만든거 \\
		setTitle("First GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윗쪽 엑스 누르면 꺼지는 동작 이뤄지도록
		setBounds(100, 100, 450, 300); //윈도우창을 띄우는데 (위치 : 화면 기준 윗쪽,아랫쪽,넓이 : 가로,세로)
		contentPane = new JPanel(); //new JPanel() 만든다 이름은contentPane이거다
		contentPane.setBackground(UIManager.getColor("Panel.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane); // 상기를 컨텐츠 패널로 만들어라
		contentPane.setLayout(null); //바뀜

		JLabel lblNewLabel = new JLabel("tree Gussing Game"); //JLabel라는 생성자를 가지고 lblNewLabel이름으로 만들겠다
		lblNewLabel.setFont(new Font("a동화B", Font.BOLD, 15)); //폰트 적용
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(82, 10, 246, 32);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("1-100 사이의 자연수 중 하나를 입력하세요");
		lblNewLabel_1.setBounds(36, 75, 240, 32);
		contentPane.add(lblNewLabel_1);

		txtGuess = new JTextField();
		txtGuess.setBounds(281, 81, 116, 21);
		contentPane.add(txtGuess);
		txtGuess.setColumns(10);

		lblMessage = new JLabel("결과 : ");
		lblMessage.setBounds(36, 133, 361, 21);
		contentPane.add(lblMessage);

		btnButtonGuess = new JButton("Guess");
		btnButtonGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//			텍스트 엑스에서 받은 숫자(숫자 문자열)를 받아서 숫자로 변환 > numGuess 에 대입한다

				int numberGuess = Integer.parseInt(txtGuess.getText()); // 문자열을 숫자로 변환 //txtGuess.getText(); //스트링임으로 정수형으로 바꿔야함
				String outMsg = "";
				// 인트 타입으로 바꾸는 클래스 . 파스 인트
				//중간점검... >> 메시지 ㅋ띄우기
				//String outMsg = "추측 숫자는 " + numberGuess + "입니다 " + "컴퓨터 숫자는" + computerNumber + "입니다"; //message 에 띄ㅜㅇㅁ\
				//lblMessage.setText(outMsg); // 스트링을 패러미터로 취하는 .setText

				//		numGuess 가 numComputer 보다 크면 : 
				//	txtMsg에 "numGuess가 문제 숫자보다 커요"를 출력
				//		(아니면)numGuess 가 numComputer 보다 작으면 : 
				//	txtMsg에 "numGuess가 문제 숫자보다 작아요"를 출력
				//		(아니면)numGuess 가 numComputer 가 같으면 : 
				//	txtMsg에 "정답"을 출력
				if(numberGuess > computerNumber) {
					outMsg = numberGuess + "가 컴퓨터 숫자보다 큽니다";

				}else if(numberGuess < computerNumber) {
					outMsg = numberGuess + " 컴퓨터 숫자보다 작습니다";
				}else {
					outMsg = numberGuess + " 정답";
				}
				
				lblMessage.setText(outMsg);//녹화 신경쓰자 진짜로...
			}
		});
		btnButtonGuess.setBounds(55, 185, 97, 23);
		contentPane.add(btnButtonGuess);

		btnRestrart = new JButton("다시하기");
		btnRestrart.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				makeNumber(); //매이크 넘버 메서드 호출
			}
		});
		btnRestrart.setBounds(179, 185, 97, 23);
		contentPane.add(btnRestrart);

		btnExit = new JButton("게임종료"); // 아까 메소드 바꿈
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //btnExit버튼에 대해서 액션이 있는지 계속 확인addActionListener
				System.exit(0); // 프로그램을 정상적으로 종료함 (0)=아무이상없이 종료하고 나감
			}
		});
		btnExit.setBounds(300, 185, 97, 23);
		contentPane.add(btnExit);
	}//겟싱 끝겟싱 생성자로 만들어져라

	//컴퓨터가 만드는 난수를 만드는 메서드/ 즉 다시하기를 누르면 아래가 생성
	public void makeNumber() {
		//전역변수 = 전체 클래스에서 선언해줘야함 (위에있)
		computerNumber =(int)(Math.random()*100+1);

		//입력창txtGuess 및 결과 메시지 클리어
		txtGuess.setText("");
		lblMessage.setText("결과 : ");

	}// end make number

}
