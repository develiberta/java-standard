class Outer {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}

class InnerEx4 {
	public static void main(String[] args) {
		// 인스턴스클래스의 인스턴스를 생성하려면
		// 외부클래스의 인스턴스를 먼저 생성해야 한다.
		// [by LSH] 내부인스턴스클래스의 인스턴스멤버를 호출하기 위해서는 외부클래스의 인스턴스를 먼저 생성해야 한다.
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		// [by LSH] 이렇게도 쓰는구나
		
		System.out.println("ii.iv : " + ii.iv);
		
		// [by LSH] 내부static클래스의 static멤버를 호출하므로 이렇게 호출 가능하다.
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		// static내부클래스의 인스턴스는 외부클래스를 먼저 생성하지 않아도 된다.
		// [by LSH] 내부static클래스의 인스턴스멤버는 외부클래스를 먼저 생성하지 않아도 된다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
//		System.out.println(Outer.StaticInner.iv);
		// [by LSH] 컴파일 에러. class가 static이라도 그 내부 변수가 static이 아니면 그 변수는 인스턴스를 생성해야 만들어지는 것
	}
}