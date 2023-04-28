## LDTS<L07><GR01> - <The Binding of Lêndea>

We decided to create an original game, based on *The Binding of Isaac*, where the user would control the hero, “Pão de Forma”, and aim to kill enemies by shooting them.

To clear the levels, Pão de Forma must kill every enemy on the map without losing all of his HP. When that happens, a door will open, allowing him to progress.

This project was developed by João Coelho ([up202004846@fe.up.pt]), João Mota ([up202108677@fe.up.pt]) and Pedro Landolt ([up202103337@fe.up.pt]) for LDTS 2022/23.



### Implemented Features


Win Screen – When the player clears a level, a special screen appears, congratulating them


Menu – We have created a menu that allows the player to start or exit the game


Multidirectional shooting – Using the arrows, you can fire shots that kill enemies, in all directions


Help Screen – Contains information on how to play the game and its elements


Game Over Screen – When the player loses, a special screen pops up with a Game Over Message


BGM - The game has background music playing


Original design for elements - The game has original designs for the main character, coins, shots and enemies


4 Levels - The game has 3 regular levels plus a special boss level, with enemies that fire back and are harder to kill


Timer - There's a timer that shows the player how long he is taking on the level that he is playing


Some Screenshots:


Help Screen:

![image](https://user-images.githubusercontent.com/92723402/207064538-d384e2c0-df1a-4444-a690-7f4d28c724d9.png)


Win Screen: 

![image](https://user-images.githubusercontent.com/92723402/207064658-17cd7ed1-3868-40a7-93bb-e345efe8633c.png)


Levels:

![image](https://user-images.githubusercontent.com/92723402/207064890-3877e8c8-ef7f-4b3e-9063-a66e2e870fa6.png)


Game Over Screen:

![image](https://user-images.githubusercontent.com/92723402/207065260-a0dd5bb8-bf6b-4537-8a28-fda35b3a203e.png)


Shooting:

![image](https://user-images.githubusercontent.com/92723402/207065958-a7d2cb80-3aa4-478e-aaed-34852a3f9f91.png)




### Design


We have used numerous design patterns, such as the State, Game Loop, Factory Method and MVC Architectural Patterns, to help solve problems in our code.


The State Pattern was useful because it allowed us to alter the health, score and kills of “Pão de Forma”, as well as the walls of the arena, during runtime.


Code examples:

State: https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/pt/up/fe/lendea/states/State.java

GameState: https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/pt/up/fe/lendea/states/GameState.java



The Game Loop pattern allowed us to process input to move the character, update the game state and render the game itself.


Code examples:

State: https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/pt/up/fe/lendea/states/State.java

Controller: https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/pt/up/fe/lendea/controller/Controller.java

GameOverController: https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/pt/up/fe/lendea/controller/menu/GameOverController.java



The Factory Method pattern allowed us to instantiate different methods for our State classes, using only the methods in the State interface, making the design more customizable.


Code examples:

State: https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/pt/up/fe/lendea/states/State.java

GameState: https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/pt/up/fe/lendea/states/GameState.java



We used the MVC Architectural Pattern to have less dependency between components in our code and allows us to work with Model, View and Controller simultaneously, and for testing to be easier.


Code examples:

Win: https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/pt/up/fe/lendea/model/menu/Win.java

WinController: https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/pt/up/fe/lendea/controller/menu/WinController.java

Win Viewer: https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/src/main/java/pt/up/fe/lendea/viewer/menu/WinViewer.java


UML Diagram:

![uml drawio](https://user-images.githubusercontent.com/92723402/208151789-9d48261a-6d02-4531-91c5-1c8b45a04a24.png)



### Testing

Test Coverage Screenshot:

![test coverage](https://user-images.githubusercontent.com/92723402/208150891-cbc96cf7-2e0c-4932-8d23-d8fc2546c25d.png)

Link to Mutation Testing report: [docs/index.html](https://github.com/FEUP-LDTS-2022/project-l07gr01/blob/main/docs/index.html)

### Self-evaluation

João Mota – 34%

João Coelho – 33%

Pedro Landolt – 33%
