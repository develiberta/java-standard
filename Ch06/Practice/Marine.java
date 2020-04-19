/* Exercise 6-9. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
 * 이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
 * (단, 모든 병사의 공격력과 방어력은 같아야 한다.)
 */
class Marine {
	int	x = 0, y = 0;			// Marine의 위치좌표(x,y)
	int hp		 = 60;			// 현재 체력
	int weapon	 = 6;			// 공격력
	int armor	 = 0;			// 방어력
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
/*
 * weapon 변수와 armor 변수에 static을 붙여야 한다.
 * 왜냐하면 모든 병사의 공격력과 방어력이 같아야 하기 때문이다.
 * weaponUp() 메서드와 armorUp() 메서드에 static을 붙여야 한다.
 * 그래야 static 변수를 호출할 수 있기 때문이다.
 * (붙이지 않는 경우 각 병사의 공격력과 방어력이 따로 설정된다.)
 */