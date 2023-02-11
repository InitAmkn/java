/*
 * Создайте метод public boolean equals(Object o)
 */

package seminars.semenar_6;

import java.time.LocalDateTime;

public class Task_class_cat {
    String name;
    String color;
    LocalDateTime date;
    String breed;

    void Print() {
        System.out.println(name + " " + color + " " + date + " " + breed);
    }

    Task_class_cat(String n, String c, LocalDateTime d, String b) {
        name = n;
        color = c;
        date = d;
        breed = b;
    }

    Task_class_cat() {
        name = "Grey";
        color = "Black";
        date = LocalDateTime.now();
        breed = "scotland";
    }

    Task_class_cat(String name, String color) {
        this.name = name;
        this.color = color;
        date = LocalDateTime.now();
        breed = "scotland";
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        Task_class_cat compareCat = (Task_class_cat) obj;
        if (this.name.equals(compareCat.name) && this.color.equals(compareCat.color))
            return true;
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        int res = this.name.hashCode();
        return res;
    }

}
