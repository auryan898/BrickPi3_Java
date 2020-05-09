public class runme {
	public static void main(String[] args){
		System.load("/home/pi/Programming/BrickPi3_Java/lib/libbrickpi.so");
		com.brickpi3.java.BrickPi3 b = new com.brickpi3.java.BrickPi3();
		b.detect();
	}
}

