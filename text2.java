
import java.util.Scanner;
public class text2 {
    public static void main(String[] args) {
        Sorev mySorev1=new Sorev();
        Scanner in = new Scanner(System.in);



        kom mykom1=new kom("Russia", 1, "sashki", 8);
        lichn mylichn=new lichn("Indonesia", 3, "vzroslui", 4);
        kom mykom2=new kom("USA", 2, "sashki", 4);
        kom mykom3=new kom("Russia", 3, "sashki", 2);


        System.out.println();
        System.out.println("Первое командное сорвенование:");
        System.out.println(mykom1.toString());
        System.out.println("Второе командное сорвенование: ");
        System.out.println(mykom2.toString());
        System.out.println("Третье командное сорвенование: ");
        System.out.println(mykom3.toString());
        System.out.println("Первое личное соревнование ");
        System.out.println(mylichn.toString());
    }
}
