package Seminar06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task01 {
    public static void main(String[] args) {
        Laptop laptop01 = new Laptop("Model01", 8, 256, "Linux", "Белый");
        Laptop laptop02 = new Laptop("Model02", 8, 512, "Windows", "Черный");
        Laptop laptop03 = new Laptop("Model03", 16, 1024, "Windows", "Белый");
        Laptop laptop04 = new Laptop("Model04", 16, 1024, "Linux", "Черный");
        Laptop laptop05 = new Laptop("Model05", 4, 256, "Linux", "Белый");
        Set<Laptop> setLaptops = new HashSet<>();
        setLaptops.add(laptop01);
        setLaptops.add(laptop02);
        setLaptops.add(laptop03);
        setLaptops.add(laptop04);
        setLaptops.add(laptop05);
        Laptop myLaptop = runConsole();
        for(Laptop laptop: setLaptops){
            if(laptop.conformity(myLaptop)){
                System.out.println(laptop.toString());
            }
        }
    }

    static Laptop runConsole(){
        Laptop myLaptop = new Laptop();
        while(true){
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("5 - Подобрать ноутбуки");
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            Scanner scanner = new Scanner(System.in);
            int selected = Integer.parseInt(scanner.nextLine());
            switch (selected){
                case 1:
                    System.out.println("Введите минимальное количество ОЗУ (в гигабайтах):");
                    myLaptop.ram = Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Введите минимальный объем ЖД (в гигабайтах):");
                    myLaptop.hdd = Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Введите название операционной системы:");
                    myLaptop.os = scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Введите цвет ноутбука:");
                    myLaptop.color = scanner.nextLine();
                    break;
                case 5:
                    return myLaptop;
                default:
                    System.out.println("Вы ввели некорректную цифру");
            }
        }
    }
}
