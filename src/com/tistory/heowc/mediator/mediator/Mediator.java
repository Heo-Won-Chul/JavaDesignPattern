package com.tistory.heowc.mediator.mediator;

import com.tistory.heowc.mediator.colleague.Colleague;

public interface Mediator {

    void registerColleague(Colleague colleague);

    void attackColleague();

    void defenseColleague();
}
