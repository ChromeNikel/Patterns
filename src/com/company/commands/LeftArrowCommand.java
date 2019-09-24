package com.company.commands;

import com.company.Arrows.Arrow;

public class LeftArrowCommand implements Command {

    Arrow leftArrow;
    String checkedString;

    public LeftArrowCommand(Arrow leftArrow, String checkedString) {
        this.leftArrow = leftArrow;
        this.checkedString = checkedString;
    }

    @Override
    public void execute() {
        leftArrow.goDirection(checkedString);
        leftArrow.getLocation();
    }

    @Override
    public void undo() {

    }
}
