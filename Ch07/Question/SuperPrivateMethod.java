class Super {
    int x = 1;
	int y = 2;
	
	private String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Sub extends Super {
    int x = 3;
	int y = 4;
	int z = 5;
	
	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
	
}

class SuperPrivateMethod {
    public static void main(String[] args) {
		Sub s1 = new Sub();
		Super s2 = new Sub();
		
        System.out.println(s1.getLocation());	// 자식에서 getLocation()을 제거하면 찾을 수 없다고 컴파일 에러. 자식에서 getLocation() 재정의(오버라이딩 X)하면 그건 호출.
		System.out.println(s2.getLocation());	// 실제 Sub()에는 getLocation()이 정의되어 있으나 컴파일 에러. 부모의 getLocation()을 호출하고자 하다가 access 문제에 걸림
												// 오버라이딩이 된다는 의미를 이해함 : 변수 타입의 메서드를 호출 후★, 실제 객체에도 해당 메서드가 있는 경우 그 메서드를 덮어써서 호출한다는 것
    }
}