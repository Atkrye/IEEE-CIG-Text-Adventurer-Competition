<b><h6>IEEE-CIG-Text-Adventurer-Competition</h6></b>

This is the repository for the 2016 IEEE CIG Text Adventurer Competition. 
Entrants submit agents to compete at completing games for the classic text adventuring engine, the Z-Machine.

Contained within the <i>Example Project</i> folder of this repository,
there is an example Java Eclipse project, which contains a minimal `Agent` that explores the game through random movements.

Agents implement a method which takes as input the text string that would be displayed to a human player each turn, 
and returns a string containing the command (e.g. "GO NORTH", "RUB LAMP", "INVENTORY") to be executed.

Additionally, 3 hard-coded commands are included for the purposes of training a solution:
-ieeecig.advent.Agent.Quit - Quits the game.
-ieeecig.advent.Agent.Restart - Restarts the game, invoking a new version of the Agent passed to the program.
-ieeecig.advent.Agent.SoftRestart - Restarts the game using the same Agent used in the previous execution.

To use this project, either:

* Checkout the project directly via your favourite Git client 

  OR 

* Download the zipfile ('Download ZIP' button, above), *unzip*
  and import into Eclipse via 'File/Import.../Existing Projects into Workspace'.
  Unzipping is necessary because importing directly from the zip archive may not work as desired.

* Right-click on `yourpackagenamehere.RandomCommandAgent` and 'Run As/Java Application'.
* Write your own `Agent` subclass as an alternative to `RandomCommandAgent`. 

The last step is AI complete in general, so it's a bit harder than the previous ones.

A second example project exists within the <i>Python 3.5 - Example Project</i> which demonstrates using the framework's built-in IOAgent.java class that allows exterior packages to implement agents. 

The following hard-coded commands, which correspond to the java hard-coded commands, can be used with IOAgent.java:
-"IEEECIG-ADVENT-QUIT-COMMAND" - Agent.Quit
-"IEEECIG-ADVENT-RESTART-COMMAND" - Agent.Restart
-"IEEECIG-ADVENT-SOFT-RESTART-COMMAND" - Agent.SoftRestart

It's possible to try out various different Z-Machine adventure files - many are freely available online (e.g. at the 'Interactive Fiction Archive').

Additional information can be found on the [competition website](http://atkrye.github.io/IEEE-CIG-Text-Adventurer-Competition/).



