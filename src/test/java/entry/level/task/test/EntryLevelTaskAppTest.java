package entry.level.task.test;

import entry.level.task.domain.usecase.PairIntegerUseCase;
import entry.level.task.domain.usecase.PairIntegerUseCaseImpl;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class EntryLevelTaskAppTest extends TestCase {


    private PairIntegerUseCase pairIntegerUseCase;

    public void init(){
        pairIntegerUseCase = new PairIntegerUseCaseImpl();
    }

    @Test
    public void testFoundPair(){

        List<String> testList = List.of("1","3","5","7","12","0");
        init();
        assertEquals( "Two pairs founded", 2, pairIntegerUseCase.getPairIntegerSumOf( testList, 12 ).size());

    }

    @Test
    public void testNotFoundPair(){

        List<String> testList = List.of("1","3","5","7","12","0");
        init();
        assertEquals( "Two pairs founded", 0, pairIntegerUseCase.getPairIntegerSumOf( testList, 20 ).size());

    }

}
