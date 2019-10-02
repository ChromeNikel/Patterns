package com.company.Arrows;

public class Diagonal {
    private int firstX;
    private int firstY;
    private int direction;




    public void setFirstX(int x) {
        firstX = x;
    }

    public void setFirstY(int y) {
        firstY = y;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getNewCoordinateX() {
        switch (direction) {
            case 0:
            case 3:
                return firstX - 1;
            case 1:
            case 2:
                return firstX + 1;
            default:
                return firstX;
        }
    }

    public int getNewCoordinateY() {
        switch (direction) {
            case 0:
            case 1:
                return firstY - 1;
            case 2:
            case 3:
                return firstY + 1;
            default:
                return firstY;
        }
    }
}
