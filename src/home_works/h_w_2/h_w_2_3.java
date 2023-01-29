package home_works.h_w_2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class h_w_2_3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 3) ** Дана json строка (можно сохранить в файл и читать из файла)
         * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
         * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
         * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
         * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст
         * строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
         * Пример вывода:
         * Студент Иванов получил 5 по предмету Математика.
         * Студент Петрова получил 4 по предмету Информатика.
         * Студент Краснов получил 5 по предмету Физика.
         */

        try {
            FileReader jsonFile = new FileReader("src/home_works/h_w_2/DATA for 2_3.json");
            int c;
            StringBuilder str = new StringBuilder();
            while ((c = jsonFile.read()) != -1) {

                str.append((char) c);
            }
            System.out.print(str.toString());
            System.out.println();

            String[][][] cash = ConvertStringToArray(str.toString());
            Print(cash);
            BeautifulPrint(cash);

        } catch (Throwable t) {
            System.out.println(t);
        }

    }

    public static void BeautifulPrint(String[][][] cash) {
        for (int i = 0; i < cash.length; i++) {

            System.out.printf("Студент %s получил %s по предмету %s.", cash[i][0][1], cash[i][1][1], cash[i][2][1]);
            System.out.println();

        }
    }

    public static void Print(String[][][] cash) {
        for (int i = 0; i < cash.length; i++) {
            for (int j = 0; j < cash[i].length; j++) {
                for (int k = 0; k < cash[i][j].length; k++) {

                    System.out.print(cash[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static String[][][] ConvertStringToArray(String str) {

        str = str.replace(" ", "");
        // str = str.replace("\n", "_");
        // str = str.replace("},{", "_");
        // str = str.replace(34, "");

        str = str.replace("\"", "");
        str = str.replace("[", "");
        str = str.replace("]", "");
        str = str.replace("{", "");
        str = str.replace("}", "");
        System.out.println();
        // System.out.println(str);

        String[] str1 = str.split("\n");
        String[][] str2 = new String[str1.length][10];
        String[][][] str3 = new String[str1.length][str2.length][2];
        for (int i = 0; i < str1.length; i++) {
            str2[i] = str1[i].split(",");

        }
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                str3[i][j] = str2[i][j].split(":");
            }
        }
        return str3;
    }

}
