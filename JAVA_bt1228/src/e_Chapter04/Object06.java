package e_Chapter04;

// 축구 선수 클래스 작성
// FootballPlayer 클래스 작성

// 클래스 필드
// : 선수 이름(name), 포지션(position), 팀 이름(team), 골 수(goals)

// 선수 정보를 출력하는 메서드
// : displayInfo() - 반환X
// : name, position, team, goals

// 생성자 명시하지 않아도 됨 (반드시 명시X)

class FootballPlayer {
	
	// 필드(속성)
	// 선언만 이루어지면 자동으로 해당 데이터 타입의 기본값이 부여
	// 참조 타입 : null
	// 기본 타입 : 각 타입의 기본값(char : " " / int : 0 / boolean : false)
	String name;
	String position;
	String team;
	int goals;
	
//	클래스는 생성자를 명시하지 않아도 자동으로 데이터를 받지 않는 빈 생성자를 포함
//	(존재하지않는 것이 아니라 존재하는데 숨어있음)
//	FootballPlayer() {
//	
//	}
	
	// 메서드
	void displayInfo() {
		System.out.println(name + ", " + position + ", " + team + ", " + goals);
	}
	
}
public class Object06 {

	public static void main(String[] args) {
		
		// FootballPlayer 클래스를 사용한 player1 객체(인스턴스) 생성
		// void 메서드 안의 생성자인 FootballPlayer()<- 똑같이 해야함
		FootballPlayer player1 = new FootballPlayer();
		player1.displayInfo(); // 선수 정보 출력 - null, null, null, 0

		// 생성된 객체(인스턴스)에 필드값을 초기화 하는 경우 (값이 없을 때)
		player1.name = "son";
		player1.position = "striker";
		player1.team = "tottenham";
		player1.goals = 12;
		player1.displayInfo(); // - son, striker, tottenham, 12

		// 또는 이미 생성된 객체의 필드값을 재할당하는 경우
		player1.goals = 13;
		player1.displayInfo(); // - son, striker, tottenham, 13
	}

}
