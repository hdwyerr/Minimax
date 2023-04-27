public class Tests{
    public static void main(String[] args){
        System.out.println("Testing NimRunner class:");
        System.out.println(NimRunner.minimax(1, true) == -1);//should be true
        System.out.println(NimRunner.minimax(0,true) == 1);//should be true
        System.out.println(NimRunner.minimax(1,false) == 1);//should be true;
        System.out.println(NimRunner.minimax(2, true) == 1); //should be true;
        System.out.println(NimRunner.minimax(2, false) == -1);;// ture; 
        System.out.println(NimRunner.minimax(3, true) ==1);
        System.out.println(NimRunner.minimax(3, false) == -1);
        System.out.println(NimRunner.minimax(4, true) == 1);
        System.out.println(NimRunner.minimax(4, false) ==-1);
        System.out.println(NimRunner.minimax(6, true) ==1);
        System.out.println(NimRunner.minimax(5, false) == 1);
        

        System.out.println(NimRunner.bestMove(2, true) == 1);
        System.out.println(NimRunner.bestMove(2, false) == 1);
        System.out.println(NimRunner.bestMove(3, true) == 2);
        System.out.println(NimRunner.bestMove(4, true) == 3);
        System.out.println(NimRunner.bestMove(6, true));//for these just seeing the values they return
        System.out.println(NimRunner.bestMove(5, false));

        System.out.println(NimRunner.runGame(4));
        System.out.println(NimRunner.runGame(6));
        System.out.println(NimRunner.runGame(5));
        System.out.println(NimRunner.runGame(8));
        System.out.println(NimRunner.runGame(12));

    }
}