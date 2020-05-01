class Super {
    int x = 1;
	int y = 2;
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Sub extends Super {
    int x = 3;
	int y = 4;
	int z = 5;
	
	String getLocation() {
		return super.getLocation() + ", z : " + z;
//		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}

class ParentMember {
    public static void main(String[] args) {
		Sub s1 = new Sub();
		Super s2 = new Super();
		Super s3 = new Sub();
		
        System.out.println(s1.getLocation());
		System.out.println(s2.getLocation());
		System.out.println(s3.getLocation());
    }
}