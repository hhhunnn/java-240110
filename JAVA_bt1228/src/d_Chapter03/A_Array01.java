package d_Chapter03;

// 배열

// 1. 배열이란?
// : 같은 타입의 여러 변수를 하나의 집합으로 다루는 것
// : 같은 타입의 데이터를 연속적으로 저장하고 쉽게 관리 가능

// '같은 타입'의 변수가 나열된 형태
// : 배열은 '생성'하여 사용 (!= 변수는 '선언'하여 사용)
public class A_Array01 {

	public static void main(String[] args) {

//		변수: 선언하여 사용
		//int korean = 90;
		int math = 70;
		int english = 100;
		
//		배열
//		: 생성하여 사용 (new 연산자를 사용하여 생성)
//		
//		1. 배열의 선언 (생성한 배열을 담을 그릇)
//		: 데이터타입[] 배열명;
//		: 데이터타입 배열명[];
		
		// 정수형의 데이터를 담을 수 있는 배열
		int[] array;
		
//		2. 배열의 생성
//		: new 데이터타입[배열의 길이]; - 동적 초기화
//		: 실제 데이터가 저장되는 것이 아님
//		: 데이터 배열이 저장된 첫 번째 메모리 주소가 저장
		array = new int[3];
		
//		배열을 선언하고 생성한 경우 모든 '요소'는 해당 데이터 타입의 기본값으로 초기화
//		문자열(''), 숫자형(0), 논리형(false)
//		
//		'요소': 배열 내의 각각의 데이터
		System.out.println(array); // [I@3d012ddd: 배열이 담긴 주소
		
//		배열을 선언한 뒤 데이터 변경(삽입)
//		: 배열 요소에 접근하기 위해서는 해당 요소의 인덱스를 이용
//		: 배열명[인덱스번호] = 데이터;
//		
//		'인덱스'
//		: 배열의 각 요소는 인덱스라는 고유한 번호로 식별
//		: 0부터 시작하기 때문에 배열의 크기보다 1이 작다
//		ex) 길이가 7인 배열의 인덱스는 0부터 6까지
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		// System.out.println(array[3]); - Error
		
//		3. 선언과 동시에 초기화 - 정적 초기화
		
//		: new 연산자를 사용한 배열 생성 시 길이 지정 X
//		: 요소의 개수를 파악하여 배열의 길이로 자동 지정
		
//		a. 데이터타입[] 배열명 = new 데이터타입[] {요소1, 요소2, 요소3 ...}
		int[] scoreList = new int[] {90, 70, 100};
		System.out.println(scoreList[0]); // 배열명[인덱스]: 변수로 사용 가능
		System.out.println(scoreList[1]);
		System.out.println(scoreList[2]);
		
//		b. 데이터타입[] 배열명 = {요소1, 요소2, 요소3 ...}
		char[] greet = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(greet[0]);
		System.out.println(greet[1]);
		System.out.println(greet[2]);
		System.out.println(greet[3]);
		System.out.println(greet[4]);

//		4. 배열의 길이(크기)
//		: .length 속성으로 확인 가능
//		: 마지막 요소의 인덱스는 배열 크기 -1
//		: 배열의 길이는 고정, 한 번 생성된 배열의 크기는 변경 불가
		int[] myArray = {1, 4, 2, 6, 4, 7, 4, 7, 1, 2, 5, 3};
//		배열명.length
		System.out.println("배열의 크기(길이): " + myArray.length);
		
//		배열의 특징
//		- 한 번 생성되면 크기 변경 X
//		- 참조 타입: 메모리 주소가 할당
//		- 배열의 모든 요소는 같은 자료형이어야 한다
//		
//		배열 내의 요소값 수정
//		: 인덱스를 통해 접근하고 수정 가능
//		
//		String타입 배열 생성
//		: String타입의 기본값은 null
		String[] fruits = new String[3];
		System.out.println(fruits[0]); // null
		
		fruits[0] = "apple";
		fruits[1] = "banana";
		fruits[2] = "cherry";
		System.out.println(fruits[0]); // apple
		System.out.println(fruits[1]); // banana
		System.out.println(fruits[2]); // cherry
		
//		<for문을 사용하여 배열의 모든 요소를 순회>
//		for문의 조건식
//		: (int 초기화 = 0; 초기화 < 배열의.길이; 초기화++)
		
//		배열의 첫 번재 요소부터 마지막 요소까지의 수 만큼 반복
//		마지막 요소의 인덱스 = 배열의 길이 -1
		System.out.println("for문을 사용한 배열의 순회");
		
		int length = fruits.length; // 속도가 빨라짐**
		for (int i = 0; i < length; i++) {
			System.out.println(fruits[i]);
		}
		
		// 각 요소(숫자)의 제곱
		System.out.println("for문을 사용한 배열의 순회2");
		int[] numbers = {1, 2, 3, 4, 5};
		int numbersLength = numbers.length;
		for (int i = 0; i < numbersLength; i++) {
			numbers[i] *= numbers[i];
			// numbers[i] = numbers[i] * numbers[i]
			System.out.println(numbers[i]);
		}
		
//		<배열의 모든 요소를 단순 순회>
//		: 향상된 for문(for-each문)
//		for (데이터타입 변수명: 해당 데이터 타입의 배열명) {
//			배열의 모든 요소에 접근하는 코드
//		}
		
		int[] arrayNumber = {1, 3, 5, 7, 9};
		for (int number: arrayNumber) {
			System.out.println(number);
		}
		
		char[] arrayChar = {'h', 'e', 'l', 'l', 'o'};
		for (char greetChar: arrayChar) {
			System.out.println(greetChar);
		}
		
		
//		for-each문
//		: 배열의 모든 요소에 대해 반복
//		: 각 반복에서 배열의 현재 요소를 지정된 변수에 할당
//		- 코드가 간결하고 가독성이 향상
//		- 인덱스를 통한 요소 접근은 불가능
		
		System.out.println("=================");
		
//		<for문, if문을 활용한 배열 내 데이터 검색>
		
//		myArray 배열에 8이 존재하는지 확인
//		반복문을 통해 배열을 순회하면서 원하는 데이터가 있는지 조건 검색
		
		int target = 3;
		int myArrayLenght = myArray.length;
		boolean found = false;
		
		for (int i = 0; i < myArrayLenght; i++) {
			if (myArray[i] == target) {
				found = true;
				break;
			}
		}		
		if (found) {
			System.out.println("데이터를 찾았습니다.");
		} else {
			System.out.println("데이터가 존재하지 않습니다.");
		}
	
//		요소 삭제
//		: 삭제의 기능을 담당하는 키워드 X
//		: 요소를 삭제하려면 삭제할 요소를 제외한 나머지 요소들을 새로운 배열로 복사
		int[] original = {1, 2, 3, 4};
		int removeIndex = 2; // 삭제할 요소의 인덱스 (3번째 요소)
		int originalLenght = original.length;
		
		int[] result = new int[original.length - 1];
		
		for (int i = 0; i < originalLenght; i++) {
			if (i == removeIndex) {
				// 루프의 나머지 부분을 건너뛰고 다음 반복을 진행
				continue;
			}
			int k = 0; // (새로운 배열의 인덱스)
			result[k++] = original[i];
			// [1]
			// [1, 2]
			// i가 2일 경우 continue문을 만나 k가 증가 X
			// i가 3일 경우 k는 2
			// : result[2] = original[3]
			// [1, 2, 4]
		}

	}

}
