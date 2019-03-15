package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot one = new Robot(400, 200);
		Robot two = new Robot(600, 350);
		Robot three = new Robot(800, 200);
		Robot four = new Robot(1000, 350);
		Robot five = new Robot(1200, 200);
		
		one.setPenColor(new Color(91, 192, 232));
		two.setPenColor(new Color(234, 191, 0));
		three.setPenColor(new Color(0, 0, 0));
		four.setPenColor(new Color(0, 120, 0));
		five.setPenColor(new Color(226, 0, 0));
		
		Thread t1 = new Thread(() ->  {
			setupRobot(one);
			moveCircle(one);
		});
		Thread t2 = new Thread(() ->  {
			setupRobot(two);
			moveCircle(two);
		});
		Thread t3 = new Thread(() ->  {
			setupRobot(three);
			moveCircle(three);
		});
		Thread t4 = new Thread(() ->  {
			setupRobot(four);
			moveCircle(four);
		});
		Thread t5 = new Thread(() ->  {
			setupRobot(five);
			moveCircle(five);
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
	
	static void moveCircle(Robot r) {
		for(int i = 0; i < 360; i++) {
			r.move(3);
			r.turn(1);
		}
	}
	
	static void setupRobot(Robot r) {
		r.hide();
		r.setSpeed(10);
		r.setPenWidth(50);
		r.penDown();
		r.turn(90);
	}
	
}

