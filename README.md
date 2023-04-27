
## Background and Motivation
Nim is a game of strategy. It is a contest between two players where there is a fixed number of piles with fixed numbers of pieces in them. The players alternate selecting a certain number of pieces from a pile, and the goal of the game is to avoid taking the last piece. Minimax is a strategy that can be used to predict the outcome of the game from any given state and whether or not it will be favorable to a given player. The algorithim distinguishes between favorable and unfavorable by assigning each player a score of 1 or -1. If you are the maximizing player, you want to be in states with the outcome of 1, because those are favorable states and you will win the game. In order to determine the favorability of a state, recursion needs to be utilized. You could be at a state where there are 5 states left until the end of the game, and since you want to know the outcome at the end of the game, you need to traverse all 5 states until the end is reached. By recursively calling minimax, you are applying the same algorithim to each state, which allows you to get an accurate end result. Nim is a good test case for the minimax algorithim because there are two players and two very clear outcomes: a state is either good and you will win, or it is bad and you will lose. Minimax also has two clear outcomes as it returns either a maximum value or a minimum value, so it is easy to relate the values from the method to the state of Nim.

## Usage
My program is run by calling the runGame method. I decided to add a parameter numPieces to this method so it is easy to change the number of pieces that are being used in the game. In order to run my code, the user should have access to Tests.java and NimRunner.java, but, since I call all necessary methods in Tests.java, that is the only file that needs to be compiled and run on the command line in order for my code to work. 

## Future Directions 
I'd like to continue to improve my code so that it would work for a game of regular Nim. In order to do this, the for loops in minimax need to traverse through all of the states, which would be representative of the different piles in Nim. Inside the loop, I'd like to create smaller array lists to represent the score of each state. Then, these smaller lists will be added to the larger list that represents all of the states in the game if you took a certain amount of pieces from a given pile. 