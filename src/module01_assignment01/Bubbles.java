package module01_assignment01;

import edu.uweo.javaintro.tools.Turtle;

public class Bubbles {

	public static void main(String[] args) {
		
		
		Turtle hair = new Turtle();
		hair.switchTo(Turtle.GREEN);
		//get in the starting spot
		hair.move(180, 240);
		//hair.say("im here at 240 from center");
		hair.fillCircle(128);
		
		//do another 180 to point right
		hair.move(180, 192);
		hair.fillCircle(64);
		
		//already pointed right, no angle changes need anymore
		hair.move(0, 96);
		hair.fillCircle(32);
		
		hair.move(0, 48);
		hair.fillCircle(16);
		
		hair.move(0, 24);
		hair.fillCircle(8);
		
		hair.move(0, 12);
		hair.fillCircle(4);
		
		hair.move(0, 6);
		hair.fillCircle(2);		
	}

}
