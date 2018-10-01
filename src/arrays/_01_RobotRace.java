package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot [] rob = new Robot[20];
		
		
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
	for (int i = 0; i < rob.length; i++) {
		rob[i] = new Robot();
		rob[i].miniaturize();
		rob[i].setSpeed(40);
		rob[i].setY(550);
		rob[i].setX(i*40+50);
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
	

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	boolean racerunning = true;
	while (racerunning==true) {
		
	
	for (int o = 0; o < rob.length; o++) {
		Random ran = new Random();
		int mov = ran.nextInt(50);
		rob[o].move(mov);
		if(rob[o].getY()<20){
			rob[o].turn(180);
			rob[o].move(50);
		}
		if(rob[o].getY()>(555)){
			racerunning=false;
			JOptionPane.showMessageDialog(null, "Robot number " + o+ " won.");
			break;
		}
		System.out.println(mov);
		
		
	}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
