/*
 * 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов. 
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество. 
3. Создайте метод public boolean equals(Object o) 
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях 
сравниваемых объектов равны. 
4. Создайте метод public int hashCode() 
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...)) 
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились. 

 */
package seminars.semenar_6;

import java.util.Arrays;
import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        Task_class_cat Pushok = new Task_class_cat("Pushok", "White");
        Task_class_cat Barsik = new Task_class_cat("Barsik", "Black");
        Task_class_cat Tuzik = new Task_class_cat("Barsik", "Black");

        HashSet<Task_class_cat> cats = new HashSet<>(Arrays.asList(Pushok, Barsik, Tuzik));
        for (var el : cats) {
            el.Print();
            System.out.println(el.hashCode());
        }
        System.out.println(Barsik.equals(Tuzik));
        System.out.println(Barsik.equals(Tuzik));

    }

}
