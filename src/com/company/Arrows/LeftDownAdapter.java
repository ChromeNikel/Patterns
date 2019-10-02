package com.company.Arrows;

public class LeftDownAdapter implements Arrow{

    private Diagonal diagonal;
    private int [][] map;
    private final String arrowName = "ВлевоВверх";

    public LeftDownAdapter(Diagonal diagonal, int [][] map) {
        this.diagonal = diagonal;
        this.map = map;
    }

    @Override
    public void getLocation() {
        for (int i = 0; i < map.length; i++)
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1) {
                    if (i == 0 || j == 9) {
                        System.out.println(String.format("Вы достигли границы в точке: %s, %s", i, j));
                        return;
                    }
                    diagonal.setDirection(3);
                    diagonal.setFirstX(i);
                    diagonal.setFirstY(j);
                    map[i][j] = 0;
                    int newI = diagonal.getNewCoordinateX();
                    int newJ = diagonal.getNewCoordinateY();
                    map[newI][newJ] = 1;
                    System.out.println(String.format("Теперь вы находитесь в точке: %s, %s", newI, newJ));
                    return;
                }
            }
    }

    @Override
    public void goDirection(String arrow) {
        System.out.println("Вы сместились " + arrowName);
    }
}
