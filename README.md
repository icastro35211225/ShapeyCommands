# ShapeyCommands
This project takes string commands that prints out diferent output, or changes an array of obejects.
---
## 'Example Input'
CREATE RECTANGLE 5 7
CREATE CIRCLE 10
SELECT 1
MOVE 10 15
COLOR Blue
UNDO
DRAW
SELECT 2
MOVE 5 5
COLOR Orange
UNDO
UNDO
MOVE 7 7
DRAW
CREATE CIRCLE 20
SELECT 4
SELECT 3
COLOR Yellow
MOVE 10 10
DELETE
UNDO
DRAWSCENE
---
## 'Example Output'
Rectangle, Color: Red, Origin: (10,15), Width: 5, Height: 7
Circle, Color: Blue, Origin: (7,7), Radius: 10
ERROR: invalid shape for SELECT
Rectangle, Color: Red, Origin: (10,15), Width: 5, Height: 7
Circle, Color: Blue, Origin: (7,7), Radius: 10
Circle, Color: Yellow, Origin: (10,10), Radius: 20
---
## Command Object (Interface)
Each command had 2 functions. An execute and undo command. Almost all commands need undo functionality, except DRAWSCENE and DRAW. DRAW just prints out the information stored in the current shape; if a current shape is selected. DRAWSCENE prints out all the shapes in that specific state.
### CREATE RECTANGLE [w] [h]
Creates a rectangle with the width [w], height [h], and oring at (0,0)
### CREATE CIRCLE [r]
Creates a circle with radius [r] and orign at (0,0)
### SELECT [n]
Makes the current shape the element in a current shapes array of index [n]
### MOVE [x] [y]
Changes the current shape's origin to x-pos [x] and y-pos [y]
### DRAW
Prints out the width an height, OR radius, and the origin of current shape
### COLOR [c]
Changes the color of the current shape to [c]
### DELETE
Deletes the current sape from the array of current shapes
### UNDO
Undos the last command that was run
---
## Command Handlers (Interface)
To handle the different commands, an interface was used. The interface Handler consists of an object of Handler that stores the next handler, and a method called request that handles a passed in command. The next handlers are set in the HandlerChain.java file. The request method cehcks if the first word in the command is specifically for that handler, if it is not, it passes the command string to the next handler. That way if ta command is to be taken out, or added, all that needs to be done is create a handler for that command which will handle the command string and pass the information to its command object.
---
## Momento Class
An object that just stores a Command object.
---
## State Class
This class stores an ArraList of current shapes, a stack of momentos, and the index of the current shape. The state handles, the adding or removing of a shape and the changing of current shape.
---
## Shape Interface
An interface that stores a Color object, and then each shape will have their own functionality for origin.
