package home_works.h_w_5;

import java.util.Random;

public class h_w_5_4 {

    public static void main(String[] args) {

        /*
         * 4) *На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
         */
        Integer[][] map = new Integer[8][8];
        fillingMap(map);
        fillingQueens(map);
        printMap(map);
    }

    public static void fillingMap(Integer[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                map[i][j] = 0;
            }
        }
    }

    public static int QueensCounter(Integer[][] map) {
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0)
                    count++;
            }
        }
        return count;
    }

    public static void fillingQueens(Integer[][] map) {

        Random r = new Random();
        int x = r.nextInt(map.length);
        int y = r.nextInt(map.length);
        map[x][y] = 1;
        while (QueensCounter(map) < map.length) {
            int i = r.nextInt(map.length);
            int j = r.nextInt(map.length);
            if (isPossiblePut(i, j, map)) {
                map[i][j] = 1;
                // printMap(map);
                // System.out.println();
            }
            if (i == map.length - 1 && j == map[i].length - 1) {
                if (QueensCounter(map) < map.length) {
                    fillingMap(map);
                }
            }
        }
    }

    public static boolean isPossiblePut(int x, int y, Integer[][] map) {
        for (int i = 0; i < map.length; i++) {
            if (i + x < map.length && i + y < map.length) {
                if (map[i + x][i + y] != 0) {
                    return false;
                }
            }
            if (x - i >= 0 && y - i >= 0) {
                if (map[x - i][y - i] != 0) {
                    return false;
                }
            }

            if (i + x < map.length && y - i >= 0) {
                if (map[i + x][y - i] != 0) {
                    return false;
                }
            }
            if (x - i >= 0 && i + y < map.length) {
                if (map[x - i][i + y] != 0) {
                    return false;
                }
            }
            if (map[x][i] != 0) {
                return false;
            }
            if (map[i][y] != 0) {
                return false;

            }

        }
        return true;
    }

    public static void printMap(Integer[][] map) {
        for (int i = 0; i < map.length; i++) {
            System.out.print(" _");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {

            for (int j = 0; j < map[i].length; j++) {

                System.out.print("|");
                if (map[i][j] == 0) {
                    System.out.print("_");
                }
                if (map[i][j] == 1) {
                    System.out.print("x");
                }
            }
            System.out.print("|");
            System.out.println();
        }

    }
}
