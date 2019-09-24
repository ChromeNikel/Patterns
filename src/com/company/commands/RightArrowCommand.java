package com.company.commands;

import com.company.Arrows.Arrow;

public class RightArrowCommand implements Command {

    Arrow rightArrow;
    String checkedString;

    public RightArrowCommand(Arrow rightArrow, String checkedString) {
        this.rightArrow = rightArrow;
        this.checkedString = checkedString;
    }

    @Override
    public void execute() {
        rightArrow.goDirection(checkedString);
        rightArrow.getLocation();
    }

    @Override
    public void undo() {

    }
}
