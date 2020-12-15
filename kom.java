public class kom extends Sorev{
    private String name;
    private int kolvo;
    public kom(){
        super();
        name="Без названия";
        kolvo=4;
    }
    public kom(String str, int n, String nazv, int kol){
        super(str,n);
        name=nazv;
        kolvo=kol;
    }
    public void setName(String nazv){
        name=nazv;
    }
    public String getName(){
        return name;
    }
    public void setKolvo(int kol){
        kolvo=kol;
    }
    public int getKolvo(){
        return kolvo;
    }
    public String toString(){
        return "Страна проведения: "+ getStrana()+" День недели: "+ getNed() +" Название сорвенований: "+name+" Количество команд: "+kolvo;
    }
}
