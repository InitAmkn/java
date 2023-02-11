package home_works.h_w_1;

import java.util.Scanner;

public class h_w_1_4 {

    public static void main(String[] args) {
        /*
         * +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
         * заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить
         * выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
         * что его нет. 24 45 //24 + 45 = 69 (n=2)
         */
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        // String equationLong = iScanner.next();
        String equationLong = "2? + 7? = 70"; // подразумеваю что цифры под "?" должны совпадать
        String[] equation = equationLong.split(" ");
        System.out.println(FindDecision(equation[0], equation[2], equation[4]));
        iScanner.close();

    }

    public static String FindDecision(String q, String w, String e) {
        int[] qIndex = new int[q.length()];
        int[] wIndex = new int[w.length()];
        StringBuilder qSB = new StringBuilder();
        StringBuilder wSB = new StringBuilder();
        for (int i = 0; i < q.length(); i++) {
            if (q.charAt(i) == '?') {
                qIndex[i] = i;
            } else {
                qIndex[i] = -1;
            }
        }
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == '?') {
                wIndex[i] = i;
            } else {
                wIndex[i] = -1;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < q.length(); j++) {
                if (j != qIndex[j]) {
                    qSB.append(q.charAt(j));
                } else {
                    qSB.append(i);
                }
            }
            for (int j = 0; j < w.length(); j++) {
                if (j != wIndex[j]) {
                    wSB.append(w.charAt(j));
                } else {
                    wSB.append(i);
                }
            }
            String qStr = qSB.toString();
            String wStr = wSB.toString();
            if (Integer.parseInt(qStr) + Integer.parseInt(wStr) == Integer.parseInt(e)) {
                return "" + qSB + " + " + wSB + " = " + e;
            }
            qSB.delete(0, q.length());
            wSB.delete(0, w.length());
        }
        return "Вариантов нет";
        // System.out.println(qSB.toString() + " " + qIndex[0]);
    }

}
