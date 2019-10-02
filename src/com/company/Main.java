package com.company;

import com.company.Generator.GeneratorArrow;
import com.company.commands.*;
import com.company.Arrows.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Запомните комбинацию:");
        String answer = new GeneratorArrow().generateOrder(10);
        String userString = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите комбинацию: ");
        Invoker invoker = new Invoker();
        Arrow arrow;
        Command command;
        GeneratorArrow generatorArrow = new GeneratorArrow();
        int [][] map = generatorArrow.generateMap();
        System.out.println(String.format("Вы находитесь в точке: %s.%s", generatorArrow.getColumn(), generatorArrow.getRow()));
        while (true) {
            userString = in.nextLine();
            switch (userString) {
                case "Вправо":
                    arrow = new RightArrow(map);
                    command = new RightArrowCommand(arrow, userString);
                    break;
                case "Влево":
                    arrow = new LeftArrow(map);
                    command = new LeftArrowCommand(arrow, userString);
                    break;
                case "Вверх":
                    arrow = new UpArrow(map);
                    command = new UpArrowCommand(arrow, userString);
                    break;
                case "Вниз":
                    arrow = new DownArrow(map);
                    command = new DownArrowCommand(arrow, userString);
                    break;
                case "ВлевоВверх":
                    arrow = new LeftUpAdapter(new Diagonal(), map);
                    command = new UpArrowCommand(arrow, userString);
                    break;
                case "ВлевоВниз":
                    arrow = new LeftDownAdapter(new Diagonal(), map);
                    command = new DownArrowCommand(arrow, userString);
                    break;
                case "ВправоВверх":
                    arrow = new RightUpAdapter(new Diagonal(), map);
                    command = new UpArrowCommand(arrow, userString);
                    break;
                case "ВправоВниз":
                    arrow = new RightDownAdapter(new Diagonal(), map);
                    command = new DownArrowCommand(arrow, userString);
                    break;
                default:
                    arrow = new ErrorArrow();
                    command = new RightArrowCommand(arrow, userString);
                    break;
            }

            invoker.setCommand(command);
            invoker.wordWrote();
        }
    }
}
