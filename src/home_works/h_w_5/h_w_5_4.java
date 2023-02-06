package home_works.h_w_5;

import java.util.Random;

public class h_w_5_4 {

    public static void main(String[] args) {

        /*
         * 4) *На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
         */
        Integer[][] map = new Integer[8][8];
        fillingFirstQueen(map);
        fillingOtherQueen(map, 7);
        printMap(map);
    }

    public static void fillingFirstQueen(Integer[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                map[i][j] = 0;
            }

        }
    }

    public static void fillingOtherQueen(Integer[][] map, int countQueen) {

        for (int x = 1; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                if (map[x][y] == 0)
                    putQueen(x, y, map);
            }
        }

        // if (countQueen > 0)
        // fillingOtherQueen(map, countQueen - 1);
    }

    public static Integer[][] putQueen(int x, int y, Integer[][] map) {
        for (int i = 0; i < map.length; i++) {
            if (i + x < map.length && i + y < map.length) {
                if (map[i + x][i + y] == 0) {
                    map[i + x][i + y] = 2;
                }
            }
            if (x - i >= 0 && y - i >= 0) {
                if (map[x - i][y - i] == 0) {
                    map[x - i][y - i] = 2;
                }
            }

            if (i + x < map.length && y - i >= 0) {
                if (map[i + x][y - i] == 0) { // map[i + x][y - i] = 2;
                    map[i + x][y - i] = 2;
                }
            }
            if (x - i >= 0 && i + y < map.length) {
                if (map[x - i][i + y] == 0) {
                    map[x - i][i + y] = 2;
                }
            }

            if (map[x][i] == 0) {
                map[x][i] = 2;
            }
            if (map[i][y] == 0) {
                map[i][y] = 2;
            }
            map[x][y] = 1;
        }
        return map;

    }

    public static void printMap(Integer[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print("|");
                if (map[i][j] == 0) {
                    System.out.print("_");
                }
                if (map[i][j] == 1) {
                    System.out.print("x");
                }
                if (map[i][j] == 2) {
                    System.out.print(".");
                }
            }
            System.out.print("|");
            System.out.println();
        }

    }
}
