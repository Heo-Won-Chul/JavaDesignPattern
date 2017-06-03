package com.tistory.heowc.mediator.mediator;

import com.tistory.heowc.mediator.colleague.Colleague;

public class CastleMediator implements Mediator {

    private Colleague colleague;

    @Override
    public void registerColleague(Colleague colleague) {
        this.colleague = colleague;
    }

    @Override
    public void attackColleague() {
        colleague.attack();
    }

    @Override
    public void defenseColleague() {
        colleague.defense();
    }
}
