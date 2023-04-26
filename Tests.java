public class Tests{
    public static void main(String[] args){
        System.out.println("Testing NimRunner class:");
        System.out.println(NimRunner.minimax(1, true) == -1);
        System.out.println(NimRunner.minimax(0,true) == 1);
    }
}