package com.tistory.heowc.mediator.colleague;

import com.tistory.heowc.mediator.mediator.Mediator;

public class WarriorColleague extends Colleague {

    public WarriorColleague(Mediator mediator) {
        super(mediator);

    }

    @Override
    public void attack() {
        System.out.println("Warrior attack !!");
    }

    @Override
    public void defense() {
        System.out.println("Warrior defense !!");
    }
}
