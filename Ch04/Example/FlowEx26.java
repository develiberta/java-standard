class FlowEx26 {
	public static void main(String[] args) {
		int sum	= 0;
		int i	= 0;
		
		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while((sum += ++i) <= 100) {
			System.out.printf("1부터 %2d까지의 합 : %2d%n", i, sum);
		}
	}	// main의 끝
}