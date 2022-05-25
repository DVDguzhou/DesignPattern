package com.hlw.MediatorPattern.CodeInBook;


import java.awt.*;

@SuppressWarnings({"all"})
public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String caption) throws HeadlessException {
        super(caption);
    }

    //保存mediator
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
