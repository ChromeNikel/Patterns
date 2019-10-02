package com.company.Arrows;

public class DownArrow implements Arrow {
    private final String arrowName = "Вниз";
    private int [][] map;

    public DownArrow(int [][] map) {
        this.map = map;
    }

    public void goDirection(String testArrow) {
        System.out.println("Вы сместились " + arrowName);
    }

    public void getLocation() {
        for (int i = 0; i < map.length; i++)
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1) {
                    if (j == 9) {
                        System.out.println(String.format("Вы достигли границы в точке: %s, %s", i, j));
                        return;
                    }
                    map[i][j] = 0;
                    map[i][j + 1] = 1;
                    System.out.println(String.format("Теперь вы находитесь в точке: %s, %s", i, j + 1));
                    return;
                }
            }
    }
}
