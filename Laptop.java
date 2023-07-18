package Seminar06;

public class Laptop {
    String name = null;
    int ram = 0;
    int hdd = 0;
    String os = null;

    String color = null;

    public Laptop(){

    }
    public Laptop(String name, int ram, int hdd, String os, String color){
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public boolean conformity(Laptop myLaptop){
        if((myLaptop.ram != 0) && (myLaptop.ram > ram)){
            return false;
        }
        if((myLaptop.hdd != 0) && (myLaptop.hdd > hdd)){
            return false;
        }
        if((myLaptop.os != null) && (!myLaptop.os.equalsIgnoreCase(os))){
            return false;
        }
        if((myLaptop.color != null) && (!myLaptop.color.equalsIgnoreCase(color))){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name + " (ОЗУ:" + ram + "Гб, Объем ЖД: " + hdd + "Гб, ОС: " + os + ", Цвет: " + color + ")";
    }
}
