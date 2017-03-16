package test.mediator;

import com.tistory.heowc.mediator.colleague.ArcherColleague;
import com.tistory.heowc.mediator.colleague.WarriorColleague;
import com.tistory.heowc.mediator.mediator.CastleMediator;
import org.junit.Test;

public class MediatorTest {

    private CastleMediator castleMediator = new CastleMediator();
    private WarriorColleague warriorColleague = new WarriorColleague(castleMediator);
    private ArcherColleague archerColleague = new ArcherColleague(castleMediator);

    @Test
    public void test_registerAndAttackWarrior() {
        castleMediator.registerColleague(warriorColleague);
        castleMediator.attackColleague();
    }

    @Test
    public void test_registerAndAttackArcher() {
        castleMediator.registerColleague(archerColleague);
        castleMediator.defenseColleague();
    }
}
