class CastingTest2 {
	public static void main(String args[]) {
		Car car			= new Car();
		Car car2		= null;
		FireEngine fe 	= null;
		
		car.drive();
		fe = (FireEngine)car;		// 컴파일은 OK. 실행 시 에러 발생
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}