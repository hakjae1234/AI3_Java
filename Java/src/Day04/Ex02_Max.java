package Day04;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		// 첫번째 줄에 입력할 개수 N을 입력받고
		// 둘쨰 줄에 N개의 정수를 공백을 두고 입력 받으시오.
		// N 개의 정수 중, 최댓값을 구하시오.
		// (입력)
		// 5
		// 90 60 70 100 55
		// (출력)
		// 최댓값 : 100

		// (순서도)
		// 1. 정수 하나를 입력받아서 N에 대입
		// 2. N개 요소를 갖는 배열 arr 선언 및 생성
		// 3. N번 반복하면서 정수를 입력받아서 arr에 순서대로 대입
		// 4. 배열을 반복해서 최댓값 max를 i번째 요소랑 비교
		// 5. 두 요소 중에서 더 큰 요소를 max 에 대입
		// 6. 반복 끝나고, max를 출력
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		// 4
		// int 최솟값 : Integer.MIN_VALUE -21억xx
		int max = 0;
		for (int i = 0; i < args.length; i++) {
			if( max < arr[i] ) {
		// 5
				max = arr[i];
			}
		}
		
		// 6
		System.out.println("최댓값 : " + max);
		sc.close();
		
	}

}
