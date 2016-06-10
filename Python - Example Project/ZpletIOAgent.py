from subprocess import Popen, PIPE, STDOUT
from random import randint
import binascii
def startZplet(jardir, gamedir):
    if(gamedir != ''):
        p = Popen(['java', '-jar', jardir, 'ieeecig.advent.IOAgent', gamedir], stdin=PIPE, stdout=PIPE)
    else:
        p = Popen(['java', '-jar', jardir, 'ieeecig.advent.IOAgent'], stdin=PIPE, stdout=PIPE)
    return (readNarrative(p),p)

def postCommand(p, command):
    print("Response: " + command)
    p.stdin.write(bytes(command + "\n", "ascii"))
    p.stdin.flush()
    return readNarrative(p)

def readNarrative(p):
    narrative=""
    cont = True
    while cont:
        for line in p.stdout:
            if(line.decode("utf-8").startswith("BREAK-NARRATIVE")):
                print("BREAK")
                cont = False
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
ret = startZplet('../Example Project/lib3rd/ieee-cig-advent-1.4.jar','../resources/monkey-and-bananas-v1.z8')
narrative = ret[0]
p = ret[1]
print("Z Machine Launched")
while True:
    command = action(narrative)
    narrative = postCommand(p, command)
