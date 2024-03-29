package c_Chapter02;

// 중첩된 반복문(nested loop)

// 중첩 루푸
// : 반복문 안에 또 다른 반복문이 있는 구조
// : 각 반복마다 내부 루프가 전체를 완전히 반복

public class E_NextedLoop {

	public static void main(String[] args) {
//		기본 구조
//		for (초기화1; 조건1; 증감1) {
//			for (초기화2; 조건2; 증감2) {
//				중첩 루프 내부의 명령문
//			}
//			외부 루프 내부의 명령문
//		}

		// 중첩 루프 예제
		// : 5 * 5 별 찍기
		
		// 외부 루프: 0부터 4까지 반복(5번)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 중첩 for문을 사용하여 구구단 출력
		// 2단부터 9단까지 반복
		for (int i = 2; i <= 9; i++) {
//			각 단마다 1 ~ 9 까지를 반복하여 곱셈식을 작성
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
			System.out.println();
		}
		
		// 중첩 for문을 사용하여 별 찍기
//		   *
//		   **
//		   ***
//		   ****
//		   ***** 
		
		// 전체 행의 반복 (5번)
		for (int i = 1; i <= 5; i++) {
			// 별의 개수가 1 ~ 5까지 증가
			// 첫 번째 줄에 1개
			// 두 번재 줄에 2개
			// ... 
			// 다섯 번째 줄에 5개
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 별 찍기 연습 문제

		// 1.
		// ***** 
		// ****
		// ***
		// **
		// *
		System.out.println("======================");

        int rows = 5; // 별을 찍을 행의 수 (5행)

        // 첫 번째 반복문: 각 행에 대해 반복
        for (int i = rows; i > 0; i--) {
        	// 두 번째 반복문: 해당 행에 별을 찍는 작업을 수행
            for (int j = 0; j < i; j++) {
            	// 별을 출력
                // print 메서드를 사용하여 별 사이에 공백 없이 출력
                System.out.print("*");
            }
            // 한 행의 별 출력이 끝나면 새로운 줄로 이동
            // println 메서드를 사용하여 줄바꿈 수행
            System.out.println();
        }

        System.out.println("======================");
		// 2.
		//   *
		//  ***
		// *****
        
        
        
        
        
        // 선생님 풀이
        int triangleRows = 3; // 삼각형의 높이 (행의 수)

        for (int i = 0; i < triangleRows; i++) {
            // 각 행에서 공백을 출력하는 반복문
            // 첫 번째 행에는 가장 많은 공백을 출력하고
        	// , 이후 각 행마다 공백이 하나씩 줄어듦
            for (int j = triangleRows - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            
            // 각 행에서 별을 출력하는 반복문
            // 별의 개수는 행마다 2씩 증가 (첫 행은 1개, 두 번째 행은 3개, ...)
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            // 한 행이 끝날 때마다 새로운 줄로 이동
            System.out.println();
        }

	}

}
