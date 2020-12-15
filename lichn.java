import java.util.Scanner;
public class lichn extends Sorev{
    private String age;
    private int razr;

    public lichn(){
        super();
        age="";
        razr=1;
    }
    public lichn(String str, int n, String ag, int r){
        super(str,n);
        age=ag;
        razr=r;
    }
    public void setAge(String ag){
        age=ag;
    }
    public String getAge(){
        return age;
    }
    public void setRazr(int r){
        razr=r;
    }
    public int getRazr(){
        return razr;
    }
    public String toString(){
        return "Страна проведения: " + getStrana()+" День недели: "+ getNed() +" Возрастная группа: "+age+" Разряд игроков: "+razr;
    }
}

