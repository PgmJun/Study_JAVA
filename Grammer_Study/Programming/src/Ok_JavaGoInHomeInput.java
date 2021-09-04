import javax.swing.JOptionPane;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.DimmingLights;

public class Ok_JavaGoInHomeInput {

	public static void main(String[] args) {
		
		//input id
		String id = JOptionPane.showInputDialog("Enter a ID");
		//input Bright
		String Bright = JOptionPane.showInputDialog("Enter a Bright");
		
		
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		  
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id+"HALL LAMP");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+"FLOOR LAMP");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+"mood LAMP");
		moodLamp.setBright(Double.parseDouble(Bright));
		moodLamp.on();
		
		
		  
	}

}
