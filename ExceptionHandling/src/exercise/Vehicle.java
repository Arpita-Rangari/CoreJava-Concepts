package exercise;

public class Vehicle {
private int speed;
public Vehicle(int speed) {
	this.speed=speed;
}

public void checkSpeed() throws MyException{
	int minSpeedLimit =60;
	int maxSpeedLimit = 100;
	
	if(speed<minSpeedLimit || speed > maxSpeedLimit) {
		throw new MyException("Speed limmit must be within 60 and 100");
	}
	else {
		System.out.println("Speed is within allowed range");
	}
}
}
