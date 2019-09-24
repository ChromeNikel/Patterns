package com.company.commands;

import com.company.Arrows.Arrow;

public class UpArrowCommand implements Command {

    Arrow upArrow;
    String checkedString;

    public UpArrowCommand(Arrow upArrow, String checkedString) {
        this.upArrow = upArrow;
        this.checkedString = checkedString;
    }

    @Override
    public void execute() {
        upArrow.goDirection(checkedString);
        upArrow.getLocation();
    }

    @Override
    public void undo() {

    }
}
