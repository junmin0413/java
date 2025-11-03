package sec01.exam03;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
