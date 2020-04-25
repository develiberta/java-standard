class Tv {
	boolean power;		// 전원상태 (on/off)
	int channel;		// 채널
	
	void power()		{ power = !power; }
	void channelUp()	{ ++channel; }
	void channelDown()	{ --channel; }
}

class VCR {
	boolean power;		// 전원상태 (on/off)
	int counter = 0;
	void power()		{ power = !power; }
	void play()			{ /* 내용생략 */ }
	void stop()			{ /* 내용생략 */ }
	void rew()			{ /* 내용생략 */ }
	void ff()			{ /* 내용생략 */ }
}

class TVCR extends Tv {
	VCR vcr = new VCR();	// VCR 클래스를 포함해서 사용
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}