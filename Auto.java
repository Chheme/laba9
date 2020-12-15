public class Auto {
    private String firm; //создаем закрытый член нашего класса с названием фирмы автомобиля
    private int maxSpeed; // закрытый член класса, содержащий максимальную скорость
    private int nomer;
    public void setFirm(String firma){ //открытая функция (метод класса) для задания
        firm=firma; //значения фирмы автомобиля
    }
    public void setMaxSpeed(int speed){ //открытая функция (метод класса) для задания
        maxSpeed=speed; //значения максимальной скорости автомобиля
    }
    public void setGosnom(int nom){ //открытая функция (метод класса) для задания
        nomer=nom; //значения максимальной скорости автомобиля
    }
    public int getMaxSpeed(){
        return maxSpeed; //максимальной скорости
    }
    public String getFirm(){ //открытая функция (метод класса) для вывода значения
        return firm; //заданной фирмы
    }
    public int getGosnom(){ //открытая функция (метод класса) для вывода значения
        return nomer; //заданной фирмы
    }
    public Auto(){ // конструктор класса (без параметров)
        firm="Без названия";
        maxSpeed=0;
        nomer=0;
    }
    public Auto(String firma, int speed, int nom){ //конструктор класса (с параметрами)
        firm=firma;
        maxSpeed=speed;
        nomer=nom;
    }
}
