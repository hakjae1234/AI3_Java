package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {
		// 성적을 입력 받아서, 성적에 따른 학점 A~F 를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 : ");
		int score = sc.nextInt();
		char grade = 'F';
		
		//if
		// 90 A
		// 80 B
		// 70 C
		// 60 D
		// 50 F
		
		if( score >= 90 && score <= 100) grade = 'A'; 
		if( score >= 80 && score < 90) grade = 'B';
		if( score >= 70 && score < 80) grade = 'C';
		if( score >= 60 && score < 70) grade = 'D';
		if( score >= 60 && score < 0) grade = 'F';
		System.out.println("학점 : "); 
		
		
		
		
			sc.close();
	}

}
