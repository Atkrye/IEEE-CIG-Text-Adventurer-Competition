from subprocess import Popen, PIPE, STDOUT
from random import randint
import binascii
def startZplet(jardir):
    p = Popen(['java', '-jar', jardir], stdin=PIPE, stdout=PIPE)
    print("Begin")
    return (readNarrative(p),p)

def postCommand(p, command):
    print(command)
    p.stdin.write(bytes(command + "\n", "ascii"))
    p.stdin.flush()
    return readNarrative(p)

def readNarrative(p):
    narrative=""
    for line in p.stdout:
        if(line.decode("utf-8").startswith("BREAK-NARRATIVE")):
            print("BREAK")
            break
        narrative = narrative + line.decode("utf-8") + "\n"
    return narrative

def action(narrative):
    print("Narrative: " + narrative)
    commands = ["n", "s", "e", "w", "verbose", "yes", "no"] 
    command = commands[randint(0,len(commands)-1)]
    if(len(command)%2==1):
        command = command + " "
    return command

print("Booting Z Machine...")
ret = startZplet('./IOieee-cig-advent-1.0.jar')
narrative = ret[0]
p = ret[1]
print("Z Machine Launched")
while True:
    command = action(narrative)
    narrative = postCommand(p, command)
