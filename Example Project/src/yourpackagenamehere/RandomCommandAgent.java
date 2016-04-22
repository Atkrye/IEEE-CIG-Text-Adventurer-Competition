package yourpackagenamehere;

import ieeecig.advent.Agent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Random;

/**
 * Your competition entry is a subclass of Agent  
 * which does its work via a callback to its overriden action method.  
 */

public final class RandomCommandAgent implements Agent {

	private Random random = new Random();
	// Java's RNG is notoriously poor...
	
	///////////////////////////////
	
	public RandomCommandAgent() {}
	
	public String action(String narrative) {
		System.out.println( narrative );
		String [] commands = new String [] { "n", "s", "e", "w", "yes", "no", "verbose" };
		String command = commands[ random.nextInt( commands.length ) ];
		System.out.println(">" + command); 
		return command;
	}
	
	///////////////////////////////
	
	public static void main( String [] args ) throws FileNotFoundException {
		
		// 1. Obtain a file or stream for the zMachineData 
		InputStream zMachineData = ieeecig.advent.Main.class.getResourceAsStream( "/resources/Advent.z5" );
		// alternatively:
		// File zMachineData = new File( "myPath/someMachineGame.z8");
		
		// 2. Create an instance of your agent
		Agent agent = new RandomCommandAgent();
		
		// 3. Invoke the adventure framework
		ieeecig.advent.Main.invoke( agent, zMachineData );
	}
}

// End ///////////////////////////////////////////////////////////////

