//Вариант 8

public class Sorev {
    private String strana;
    private int ned;
    public void setStrana(String str){
        strana=str;
    }

    public void setNed(int n){
        ned=n;
    }

    public String getStrana(){
        return strana;
    }
    public int getNed(){
        return ned;
    }


    public Sorev(){
        strana="Без названия";

        ned=0;
    }
    public Sorev(String str, int n){
        strana=str;
        ned=n;
    }
}