package yourpackagenamehere;

import ieeecig.advent.Agent;

import java.io.File;
import java.io.FileInputStream;
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

		// 1. Create an instance of your agent		
		Agent agent = new RandomCommandAgent();
		
		if( args.length == 0 ) {

			// 2. Load the default adventure file
			InputStream zMachineData = ieeecig.advent.Main.class.getResourceAsStream( "monkey-and-bananas-v1.z8" );
			
			// 3. Invoke the adventure framework			
			ieeecig.advent.Main.invoke( agent, zMachineData );
		}
		else {

			// 2. Load the adventure file, e.g. "myPath/someMachineGame.z8"			
			File zMachineData = new File( args[ 0 ] );
			
			// 3. Invoke the adventure framework			
			ieeecig.advent.Main.invoke( agent, zMachineData );
		}
	}
}

// End ///////////////////////////////////////////////////////////////

