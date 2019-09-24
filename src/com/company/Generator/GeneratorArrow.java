package com.company.Generator;

import java.util.Random;

public class GeneratorArrow {

    private final String rightArrow = "Вправо ";
    private final String leftArrow = "Влево ";
    private final String upArrow = "Вверх ";
    private final String downArrow = "Вниз ";

    private String endString = "";

    private int column = 0;
    private int row = 0;

    public String generateOrder(int count) {
        for (int i = 0; i < count; i++)
        switch (new Random().nextInt(4)) {
            case 0:
                endString += rightArrow;
                break;
            case 1:
                endString +=leftArrow;
                break;
            case 2:
                endString +=upArrow;
            case 3:
                endString +=downArrow;
        }
        System.out.println(endString);
        return endString;
    }

    public int [][] generateMap() {
        int k = new Random().nextInt(9) + 1;
        int l = new Random().nextInt(9) + 1;
        int [][] map = new int[10][10];
        for (int i = 0; i < map.length; i++)
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 0;
                if (k == i && l == j) {
                    map[i][j] = 1;
                    column = i;
                    row = j;
                }
            }
        return map;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}
