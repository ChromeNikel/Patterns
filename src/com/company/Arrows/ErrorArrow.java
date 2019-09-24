package com.company.Arrows;

public class ErrorArrow implements Arrow {
    private final String arrowName = "Вправо";

    public void goDirection(String testArrow) {
        System.out.println("Вы сместились " + arrowName);
    }

    public void getLocation() {
        System.out.println(arrowName);
    }
}
