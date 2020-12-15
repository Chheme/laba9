public class ChempTest {
    public static void main(String[] args) {
        Chempionat myChemp=new Chempionat();
        kom mykom1=new kom("Russia", 1, "sashki", 8);
        myChemp.addSor(mykom1);
        lichn mylichn=new lichn("Indonesia", 3, "vzroslui", 4);
        kom mykom2=new kom("USA", 2, "sashki", 4);
        kom mykom3=new kom("Russia", 3, "sashki", 2);
        myChemp.addSor(mykom2);
        myChemp.addSor(mykom3);
        myChemp.addSor(mylichn);
        myChemp.printChemp();
    }
}
