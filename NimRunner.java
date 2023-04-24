public class NimRunner{
    public static void main(String[] args){

    }
    //run game returns boolean
    //get x and y move return ints
    //some kind of dsiplay or printing method (state)
    
    public static boolean runGame(){
        int numPieces =6;
        while(numPieces >0){
            numPieces -= getXMove();
            numPieces -= getYMove();
            
        }
        return false;//true if player x wins, false if player y wins 
    }

    public static int getXMove(/*state*/){
        return 1;//want to ultimately use best move in here 
    }

    public static int getYMove()/*state*/{
        return 1;
    }

    public static int minimax(int piecesLeft, boolean myTurn){
        //check base case
        if(piecesLeft ==0){
            if(myTurn ==true){
                return 1;
            }
            return -1;
        }
        //else, loop through 3 other options
        else{
            //in for loop, need to return either min or max of 3 scores
            //make an array list
            //loop thru 3 possilbe states options and call minimax for each state, you will get 1 or -1
            //add each score to al 
            //then return max of min of al based on whose turn it is 
        }
        //make al 
        ArrayList<Integer> scoresAL = new ArrayList<>; 
        for(int piecesToTake =1; piecesToTake <= 3; piecesToTake++){
            //calculate score for possible state
            if(piecesToTake <= piecesLeft){
                int score = minimax(piecesLeft-piecesToTake);
            }
            
            scoresAL.add(score);
            //return max
        }

        if(myTurn){
            int max = -2;//
            for(int i =0; i< scoresAl.size(); i++){
                if(scoresAL.get(i) > max){
                    max = scoresAL.get(i);
                }
            }
            return max;
        }
        else{
            int min = 2;
            for(int i=0; i< scoresAL.size(); i++){
                if(scoresAL.get(i) < min){
                    min = scoresAL.get(i);
                }
            }
            return min; 
        }
    }

    public int bestMove(int pieces, )
    //best move returns int, number of piecies you are going to take
    //params are numpieces and myTurn
    //figure out the next state and then call minimax for the next tae
    //if positive, break 
    //otherwise return the move you should make, number of pieces you should take 
    //method is not recursive 
}