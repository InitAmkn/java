package home_works.h_w_2;

import java.util.Scanner;

public class h_w_2_1 {

    public static void main(String[] args) {
        /*
         * 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть
         * WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
         * ниже в виде json строки.
         * Если значение null, то параметр не должен попадать в запрос.
         * Параметры для фильтрации: String str =
         * "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
         * Результат "select * from students where “name” = “Ivanov” and
         * “country”=”Russia” …
         * 
         */

        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";

        String encoding = System.getProperty("console.encoding", "cp866");
        try (Scanner iScanner = new Scanner(System.in, encoding)) {

            ConvertStringToArray(str, ",", ":");
            System.out.println(SQLСreator(NullFilter(ConvertStringToArray(str, ",", ":"))));

        }
    }

    public static String SQLСreator(String[][] strClean) {
        // “name” = “Ivanov” and “country” = ”Russia”
        StringBuilder resultStr = new StringBuilder();
        resultStr.append("select * from students where ");
        for (int i = 0; i < strClean.length; i++) {
            resultStr.append("\"");
            resultStr.append(strClean[i][0]);
            resultStr.append("\"");
            resultStr.append(" = ");
            resultStr.append("\"");
            resultStr.append(strClean[i][1]);
            resultStr.append("\"");
            if (i < strClean.length - 1) {
                resultStr.append(" and ");
            }
        }
        return resultStr.toString();
    }

    public static String[][] NullFilter(String[][] strArray) {
        int count = 0;
        for (String[] strings : strArray) {
            if (strings[1].equals("null")) {
                count++;
            }
        }

        String[][] strClean = new String[strArray.length - count][2];
        int j = 0;
        for (int i = 0; i < strClean.length; i++) {
            if (!strArray[i][1].equals("null")) {
                strClean[j] = strArray[i];
            }
            j++;
        }
        return strClean;
    }

    public static String[][] ConvertStringToArray(String str, String sep1, String sep2) {
        str = str.replace(" ", "");
        str = str.replace("select*fromstudentswhere", "");
        str = str.replace("{", "");
        str = str.replace("}", "");
        str = str.replace("'", "");
        str = str.replace("“", "");
        str = str.replace("”", "");
        String[] strTemp = str.split(sep1);
        String[][] strClean = new String[strTemp.length][2];

        for (int i = 0; i < strTemp.length; i++) {
            strClean[i] = strTemp[i].split(sep2);
        }

        return strClean;
    }

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
     * 4) К калькулятору из предыдущего дз добавить логирование.
     */
}
