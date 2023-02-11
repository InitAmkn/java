package seminars.semenar_6;

import java.time.LocalDateTime;

public class Cat {
    /*
     * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
     * приложения, которое является
     * а) информационной системой ветеринарной клиники
     * б) архивом выставки котов
     * в) информационной системой Театра кошек Ю. Д. Куклачёва
     * Можно записать в текстовом виде, не обязательно реализовывать в java.
     */

    String name;
    String color;
    LocalDateTime date;
    String breed;

    void print() {
        System.out.println(name + " " + color + " " + breed);
    }

    Cat(String _name,
            String _color,
            LocalDateTime _date,
            String _breed) {

        name = _name;
        color = _color;
        date = _date;
        breed = _breed;
    }

    Cat() {

        name = "vasya";
        color = "black";
        date = LocalDateTime.now();
        breed = "";
    }

    Cat(String name,
            String color) {
        this.name = name;
        this.color = color;
        date = LocalDateTime.now();
        breed = "none";
    }
}
