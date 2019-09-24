package com.company.commands;

import com.company.Arrows.Arrow;

public class DownArrowCommand implements Command {

    Arrow downArrow;
    String checkedString;

    public DownArrowCommand(Arrow downArrow, String checkedString) {
        this.downArrow = downArrow;
        this.checkedString = checkedString;
    }

    @Override
    public void execute() {
        downArrow.goDirection(checkedString);
        downArrow.getLocation();
    }

    @Override
    public void undo() {

    }
}
