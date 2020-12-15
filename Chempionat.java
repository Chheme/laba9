import java.util.ArrayList;
public class Chempionat {
    private ArrayList<Sorev> so=new ArrayList<Sorev>();
    public void addSor(Sorev w){
        so.add(w);
    }

    public Chempionat (){
    }
    public Boolean findCar(Sorev w){
        return so.contains(w);
    }
    public Chempionat(ArrayList< Sorev> n){
        so=n;
    }
    public void printChemp() {
        System.out.println("В чемпионате: ");
        int y=0,x=0;
        for (Sorev a:so){
                if (a instanceof kom) {System.out.println("\t"+a.toString());
                y++;}
            else if (a instanceof lichn) {System.out.println("\t"+a.toString());
                    x++;}
        }
        System.out.println("Количество командных сорвенований в чемпионате: "+y);
        System.out.println("Количество личных сорвенований в чемпионате: "+x);
    }
}
