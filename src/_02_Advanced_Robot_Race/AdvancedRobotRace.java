package _02_Advanced_Robot_Race;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	
	public static void main(String[] args) {
		
		Robot[] robots = new Robot[5];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot((i * 150) + 150, 550);
			robots[i].setSpeed(10);
		}
		
		Random rand = new Random();
		
		Thread t1 = new Thread(() -> {
			
			while (robots[0].getY() > 150 && robots[1].getY() > 150 && robots[2].getY() > 150 && robots[3].getY() > 150
					&& robots[4].getY() > 150) {
				
				robots[0].move(rand.nextInt(10));
				
			}
			
			if (robots[0].getY() <= 150) {
				robots[0].turn(28689);
			}
			
		});
		
		Thread t2 = new Thread(() -> {
			
			while (robots[0].getY() > 150 && robots[1].getY() > 150 && robots[2].getY() > 150 && robots[3].getY() > 150
					&& robots[4].getY() > 150) {
				
				robots[1].move(rand.nextInt(10));
				
			}
			
			if (robots[1].getY() <= 150) {
				robots[1].turn(28689);
			}
			
		});
		
		Thread t3 = new Thread(() -> {
			
			while (robots[0].getY() > 150 && robots[1].getY() > 150 && robots[2].getY() > 150 && robots[3].getY() > 150
					&& robots[4].getY() > 150) {
				
				robots[2].move(rand.nextInt(10));
				
			}
			
			if (robots[2].getY() <= 150) {
				robots[2].turn(28689);
			}
			
		});
		
		Thread t4 = new Thread(() -> {
			
			while (robots[0].getY() > 150 && robots[1].getY() > 150 && robots[2].getY() > 150 && robots[3].getY() > 150
					&& robots[4].getY() > 150) {
				
				robots[3].move(rand.nextInt(10));
				
			}
			
			if (robots[3].getY() <= 150) {
				robots[3].turn(28689);
			}
			
		});
		
		Thread t5 = new Thread(() -> {
			
			while (robots[0].getY() > 150 && robots[1].getY() > 150 && robots[2].getY() > 150 && robots[3].getY() > 150
					&& robots[4].getY() > 150) {
				
				robots[4].move(rand.nextInt(10));
				
			}
			
			if (robots[4].getY() <= 150) {
				robots[4].turn(28689);
			}
			
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}
}
