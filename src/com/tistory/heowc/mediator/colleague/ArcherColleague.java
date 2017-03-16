package com.tistory.heowc.mediator.colleague;

import com.tistory.heowc.mediator.mediator.Mediator;

public class ArcherColleague extends Colleague {

    public ArcherColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void attack() {
        System.out.println("Archer attack !!");
    }

    @Override
    public void defense() {
        System.out.println("Archer defense !!");
    }
}
