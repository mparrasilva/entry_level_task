package entry.level.task.infrastructure.adapter.commandline;

import entry.level.task.domain.model.PairInteger;

import java.util.List;

public class OutputResultImpl implements  OutputResult{

    @Override
    public void print(List<PairInteger> pairResultList){

        System.out.println("Result");

        if( pairResultList.size() > 0 )
            pairResultList.forEach( pair -> System.out.println("+ " + pair.getPositionOne() + "," + pair.getPositionTwo()) );
        else
            System.out.println("Pairs integer not found");

    }
}
