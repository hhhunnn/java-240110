package f_Chapter05;

// 객체 지향 프로그램의 '변수'

// 객체의 속성을 '변수'로 표현
// : 객체의 상태를 저장

// 필드, 지역 변수 차이
// 1. 필드: 객체의 지속적인 상태를 저장하는 클래스 내부의 변수
// 2. 지역 변수: 메서드가 실행되는 동안에만 존재하는 일시적인 변수

//! 인스턴스 변수
// : 클래스의 각 객체(인스턴스)에 속한 변수, 각 객체마다 독립적인 값을 가짐
// : 클래스 내부에서 선언, 객체가 생성될 때 메모리에 할당

// 인스턴스 변수의 특징
// : 각 객체에 대한 고유한 값을 가짐(각 객체마다 값이 다름)
// : 캡슐화와 정보 은닉을 통해 보안을 유지 (private 원칙)
// : 메서드를 통해서만 접근하고 변경을 원칙

//! 클래스(정적) 변수
// : static 키워드를 사용하여 선언되는 변수

// 클래스(정적) 변수의 특징
// : 인스턴스가 아닌 전체 클래스에 속함, 클래스의 모든 인스턴스에서 공유되는 하나의 데이터값 
// : 프로그램이 시작할 때 생성, 프로그램이 종료될 때 소멸 (메모리에 할당)
// : 클래스별 상수, 해당 클래스로 생성되는 모든 객체에 공유되어야 하는 값에 할당
// '클래스'는 메모리에 할당X, '클래스 변수'는 선언만 해도 메모리에 할당됨, 객체가 생성되기 전에도 접근가능

// <<<< 1 >>>>>
class Car {
//	인스턴스 변수
// : 필드(객체의 상태)
	String color;
	int speed; // 차의 현재 속력
	String brand;
	
	// 속도를 증가 시키는 메서드
	// increment: 지역 변수 ㄱ
	void accelerate(int increment) {
		speed += increment; // speed = speed + increment
	}
	
	// 속도 확인을 위한 출력 메서드
	void displayInfo() {
		System.out.println("Speed: " + speed);
	}
}

// <<<< 2 >>>>>
class Dog {
//	인스턴스 변수 선언
	private String name;
	private int age;
	
//	생성자
	Dog(String name, int age) {
		
//		Dog클래스로 생성된 객체(인스턴스)의 name = 객체 생성 시의 데이터;
//		객체의 인스턴스 변수 = "choce"; // choco를 인스턴스 변수에 할당한다.
		this.name = name;
		this.age = age;
	}	
}


// <<<< 3 >>>>>
// A 고등학교의 3학년 학생 관리 시스템
class Student {
//	클래스 변수의 경우 변수 선언 맨 처음에 static 키워드로 정의
//	: 모든 객체에 같은 값
	static String schoolName; // 학교 이름 // 클래스 변수 호출 방법 1
	static int grade = 3; // 학년 번호 // 클래스 변수 호출 방법 2
	
//	인스턴스 변수
//	: 객체 마다 부여되는 값 (다 다르기 때문)
	String name; // 학생 이름
	int studentNumber; // 학생 번호
}



public class Object01 {
	public static void main(String[] args) {

		// <<<< 1 >>>>>
		Car myCar = new Car();
		myCar.color = "white";
		myCar.brand = "HyunDai";
		myCar.speed = 0;
		
		myCar.accelerate(30);
		myCar.displayInfo(); // Speed: 30
		
		System.out.println("========");
		
		
		// <<<< 2 >>>>>
		// Dog 객체 생성
		Dog myDog = new Dog("choce", 3);
		
//		인스턴스 변수를 private하게 접근을 제어(원칙)
//		private 접근제어(제한)자: 해당 클래스 외부에서는 접근이 불가
		// myDog.age = 4; - Error // 해당 클래스 외부이기때문
		
		System.out.println("=====");
		
		
		// <<<< 3 >>>>>
		
//		Student 클래스 내부의 클래스(정적) 변수 사용
//		클래스 변수에 접근 또는 값을 할당하려면
//		클래스 이름을 통해 직접 접근 : 객체 생성 전에 호출 가능 
		Student.schoolName = "A고등학교"; // 정적 변수에 값 할당
		System.out.println(Student.schoolName);
		
		System.out.println(Student.grade);
		
//		인스턴스 변수(객체가 생성된 후에 접근 가능)
//		객체명.변수명
//		빈 생성자 사용으로 생성과 동시에 필드값 초기화 X -> (new Student(); 부분)
		Student student01 = new Student();
		student01.name = "이승아";
		student01.studentNumber = 1234;
		
//		클래스 변수는 인스턴스 변수에 할당되어 사용할 수 X
//		클래스 변수는 항상 클래스명으로 호출!
		// student01.schoolName; - Error
//		    ㄴ인스턴스변수(객체) ㄴ 정적 변수
	}

}
