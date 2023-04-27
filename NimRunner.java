import java.util.*;
public class NimRunner{
    public static void main(String[] args){

    }
    public static boolean runGame(int numPieces){
        //change for regular nim, al to hold more data
        while(numPieces >0){
            if(numPieces ==1){
                //1 piece left and x's turn, so y wins
                System.out.println("Y won");
                return false;
            }
            numPieces -= getXMove(numPieces);
            System.out.println("numPieces is after x" + numPieces);
            if(numPieces ==1){//checking this here so i know whose turn it is and who won/lost
                //1 piece left and y's turn, so x wins
                System.out.println("X won");
                return true;
            }
            numPieces -= getYMove(numPieces);
            System.out.println("numPieces is after y" + numPieces);
        }
        //true if player x wins, false if player y wins 
        return true;//backup in case loop fails
    }

    public static int getXMove(int numPieces){
        //player x is maximizing player, so returning 1 when it is good
        return bestMove(numPieces, true);
    }

    public static int getYMove(int numPieces){
        //player y is minimizing player, so returning -1 is good for them
        return bestMove(numPieces, false);
    }

    public static int minimax(int piecesLeft, boolean myTurn){
        //al to hold the scores of each state later on
        ArrayList<Integer> scoresAL = new ArrayList<>();
        //check base case
        if(piecesLeft ==0){
            if(myTurn ==true){
                return 1;//maximizing for player x
            }
            return -1;
        }
        //else, loop through 3 other options, different states of what could happen
        else{
            for(int piecesToTake =1; piecesToTake <= 3; piecesToTake++){
                //calculate score for possible state
                if(piecesToTake <= piecesLeft){
                    int score = minimax(piecesLeft-piecesToTake, !myTurn);//each time you move to a new state the turn alternates
                    scoresAL.add(score);
                }
            }
        }
        if(myTurn){
            //finding max for player x
            int max = -2;
            for(int i =0; i< scoresAL.size(); i++){
                if(scoresAL.get(i) > max){
                    max = scoresAL.get(i);
                }
            }
            return max;
        }
        else{
            //finding min for player y
            int min = 2;
            for(int i=0; i< scoresAL.size(); i++){
                if(scoresAL.get(i) < min){
                    min = scoresAL.get(i);
                }
            }
            return min; 
        }
    }

    
    
    public static int bestMove(int numPieces, boolean myTurn){
        //for simple nim you can only take 1, 2, or 3 pieces
        //first for player x, who would want to maximize
        if(myTurn){
            //if you were to take 1 piece
            if(minimax(numPieces-1, false) == 1){//1 is the bad outcome for player y (who uses the false parameter), so therefore good for player x 
                return 1;
            }
            //if you were to take 2 pieces
            else if(minimax(numPieces-2, false) == 1){
                return 2;
            }
            else if(minimax(numPieces-3, false) == 1){
                return 3;
            }
        }
        else{//player y wants to minimize
            //-1 is a bad outcome for x, and since the conditions represent the next state, that means it is good for player y
            if(minimax(numPieces-1, true) == -1){
                return 1;
            }
            else if(minimax(numPieces-2, true) == -1){
                return 2;
            }
            else if(minimax(numPieces-3, true) == -1){
                return 3;
            }
            else{
                System.out.println("Sorry! There are no moves for you to take that guarantee a victory");//sometimes the algorithim just will not work
                return 1;
            }
        }
       return 0;//return to avoid error

    }

    //refactoring for regular nim
    //state is no longer an integer bc there are multiple piles- al of numbers that represetn numPieces in each pile
    //use paralell al to determine num pieces since it will only be from one pile [0,0,3,0] to get move, change return val to al
    //any for loop that iterates over possible moves , double al

    //refactoring pseudocode
    //set up moves al of al of ints
    //for loop to interate through indexes within state, represetns each pile
        //inner for loop through value at each index (number of possible pieces to be taken from particular pile)
            //make a new array list of ints (represetns 1 move)
            //at same index you are at in state (pile), in the small al add numPieces you could take from that pile 
            //add small al to big al 
}