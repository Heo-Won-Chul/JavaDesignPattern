package com.tistory.heowc.mediator.colleague;

import com.tistory.heowc.mediator.mediator.Mediator;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void attack();
    public abstract void defense();
}
