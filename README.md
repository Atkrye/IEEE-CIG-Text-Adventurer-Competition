<b><h6>IEEE-CIG-Text-Adventurer-Competition</h6></b>

This is the repository for the 2016 IEEE CIG Text Adventurer Competition. This is a competition where entrants submit agents to compete at completing games for the classic text adventuring engine, the Z-Machine.

Contained within the <i>Example Project</i> folder of this repository,
there is an example Java Eclipse project, 
which contains an Agent that explores the game through random movements.

Agents implement a method which takes as input the text string that would be displayed to a human player each turn, 
and returns a string containing the command (e.g. "GO NORTH", "RUB LAMP", "INVENTORY") to be executed.

To use this project, either:
* Checkout the project directly via your favourite Git client 
* OR Download the zipfile ('Download ZIP' button, above), unzip and import into Eclipse 
via `File/Import.../Existing Projects into Workspace'.
* Import into Eclipse via `File/Import/Existing Projects into Workspace...'
* Write your own Agent subclass as an alternative to RandomCommandAgent.

It's also possible to try out various different z-machine adventure files - many are freely available online.
A second example project exists within the <i>Python - Example Project</i> which demonstrates using the frameworks build-in IOAgent.java class that allows exterior packages to interact with the Z-Machine.


